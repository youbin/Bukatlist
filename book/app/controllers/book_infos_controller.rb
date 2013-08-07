class BookInfosController < ApplicationController
  before_action :set_book_info, only: [:show, :edit, :update, :destroy]

  # GET /book_infos
  # GET /book_infos.json
  def index
    @book_infos = BookInfo.all
    @book_details = BookDetail.all
  end

  # GET /book_infos/1
  # GET /book_infos/1.json
  def show
  end

  # GET /book_infos/new
  def new
    @book_info = BookInfo.new
    @book_detail = BookDetail.new
  end

  # GET /book_infos/1/edit
  def edit
  end

  # POST /book_infos
  # POST /book_infos.json
  def create
    @book_info = BookInfo.new(book_info_params)

    respond_to do |format|
      if @book_info.save
        format.html { redirect_to @book_info, notice: 'Book info was successfully created.' }
        format.json { render action: 'show', status: :created, location: @book_info }
      else
        format.html { render action: 'new' }
        format.json { render json: @book_info.errors, status: :unprocessable_entity }
      end
    end

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

  # PATCH/PUT /book_infos/1
  # PATCH/PUT /book_infos/1.json
  def update
    respond_to do |format|
      if @book_info.update(book_info_params)
        format.html { redirect_to @book_info, notice: 'Book info was successfully updated.' }
        format.json { head :no_content }
      else
        format.html { render action: 'edit' }
        format.json { render json: @book_info.errors, status: :unprocessable_entity }
      end

      if @book_detail.update(book_detail_params)
        format.html { redirect_to @book_detail, notice: 'Book detail was successfully updated.' }
        format.json { head :no_content }
      else
        format.html { render action: 'edit' }
        format.json { render json: @book_detail.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /book_infos/1
  # DELETE /book_infos/1.json
  def destroy
    @book_info.destroy
    respond_to do |format|
      format.html { redirect_to book_infos_url }
      format.json { head :no_content }
    end
    
    @book_detail.destroy
    respond_to do |format|
      format.html { redirect_to book_details_url }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_book_info
      @book_info = BookInfo.find(params[:id])
    end

    def set_book_detail
      @book_detail = BookDetail.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def book_info_params
      params.require(:book_info).permit(:b_id, :b_title, :b_thumb, :b_totalStar, :b_starNum, :b_likeCount, :b_belongCount)
    end

    def book_detail_params
      params.require(:book_detail).permit(:b_id, :b_title, :b_category, :b_author, :b_translator, :b_publisher, :b_publishDate, :b_date)
    end

end
