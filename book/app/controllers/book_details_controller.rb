class BookDetailsController < ApplicationController
  before_action :set_book_detail, only: [:show, :edit, :update, :destroy]

  # GET /book_details
  # GET /book_details.json
  def index
    @book_details = BookDetail.all
  end

  # GET /book_details/1
  # GET /book_details/1.json
  def show
  end

  # GET /book_details/new
  def new
    @book_detail = BookDetail.new
  end

  # GET /book_details/1/edit
  def edit
  end

  # POST /book_details
  # POST /book_details.json
  def create
    @book_detail = BookDetail.new(book_detail_params)

    respond_to do |format|
      if @book_detail.save
        format.html { redirect_to @book_detail, notice: 'Book detail was successfully created.' }
        format.json { render action: 'show', status: :created, location: @book_detail }
      else
        format.html { render action: 'new' }
        format.json { render json: @book_detail.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /book_details/1
  # PATCH/PUT /book_details/1.json
  def update
    respond_to do |format|
      if @book_detail.update(book_detail_params)
        format.html { redirect_to @book_detail, notice: 'Book detail was successfully updated.' }
        format.json { head :no_content }
      else
        format.html { render action: 'edit' }
        format.json { render json: @book_detail.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /book_details/1
  # DELETE /book_details/1.json
  def destroy
    @book_detail.destroy
    respond_to do |format|
      format.html { redirect_to book_details_url }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_book_detail
      @book_detail = BookDetail.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def book_detail_params
      params.require(:book_detail).permit(:b_id, :b_title, :b_category, :b_author, :b_translator, :b_publisher, :b_publishDate, :b_date)
    end
end
