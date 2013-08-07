class BooksController < ApplicationController
  before_action :set_book, only: [:show, :edit, :update, :destroy]

  # GET /books
  # GET /books.json
  def index
    @books = Book.all
    @books = BookDetail.all
  end

  # GET /books/1
  # GET /books/1.json
  def show
  end

  # GET /books/new
  def new
    @book = Book.new
    @book_detail = BookDetail.new
  end

  # GET /books/1/edit
  def edit
  end

  # POST /books
  # POST /books.json
  def create
#    @book = Book.new(book_params)
    @book_detail = BookDetail.new(params[:book_detail])

    respond_to do |format|
      if @book_detail.save
        format.html { redirect_to @book_detail, notice: 'Book was successfully created.' }
        format.json { render action: 'show', status: :created, location: @book_detail }
      else
        format.html { render action: 'new' }
        format.json { render json: @book.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /books/1
  # PATCH/PUT /books/1.json
  def update
    respond_to do |format|
      if @book.update(book_params) && @book_detail.update(book_detail_params)
        format.html { redirect_to @book, notice: 'Book was successfully updated.' }
        format.json { head :no_content }
      else
        format.html { render action: 'edit' }
        format.json { render json: @book.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /books/1
  # DELETE /books/1.json
  def destroy
    @book.destroy
    @book_detail.destroy
    respond_to do |format|
      format.html { redirect_to books_url }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_book
      @book = Book.find(params[:id], :include => :book_detail)
      
      @book_detail = BookDetail.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def book_params
      params.require(:book).permit(:b_id, :b_title, :b_thumb, :b_totalStar, :b_starNum, :b_likeCount, :b_belongCount)
    end
    def book_detail_params
      params.require(:book_detail).permit(:b_id, :b_title, :b_category, :b_author, :b_translator, :b_publisher, :b_publishDate, :b_date)
    end
end
