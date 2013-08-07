require 'test_helper'

class BookDetailsControllerTest < ActionController::TestCase
  setup do
    @book_detail = book_details(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:book_details)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create book_detail" do
    assert_difference('BookDetail.count') do
      post :create, book_detail: { b_author: @book_detail.b_author, b_category: @book_detail.b_category, b_date: @book_detail.b_date, b_id: @book_detail.b_id, b_publishDate: @book_detail.b_publishDate, b_publisher: @book_detail.b_publisher, b_title: @book_detail.b_title, b_translator: @book_detail.b_translator }
    end

    assert_redirected_to book_detail_path(assigns(:book_detail))
  end

  test "should show book_detail" do
    get :show, id: @book_detail
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @book_detail
    assert_response :success
  end

  test "should update book_detail" do
    patch :update, id: @book_detail, book_detail: { b_author: @book_detail.b_author, b_category: @book_detail.b_category, b_date: @book_detail.b_date, b_id: @book_detail.b_id, b_publishDate: @book_detail.b_publishDate, b_publisher: @book_detail.b_publisher, b_title: @book_detail.b_title, b_translator: @book_detail.b_translator }
    assert_redirected_to book_detail_path(assigns(:book_detail))
  end

  test "should destroy book_detail" do
    assert_difference('BookDetail.count', -1) do
      delete :destroy, id: @book_detail
    end

    assert_redirected_to book_details_path
  end
end
