require 'test_helper'

class BooksControllerTest < ActionController::TestCase
  setup do
    @book = books(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:books)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create book" do
    assert_difference('Book.count') do
      post :create, book: { b_author: @book.b_author, b_belongCount: @book.b_belongCount, b_category: @book.b_category, b_date: @book.b_date, b_id: @book.b_id, b_likeCount: @book.b_likeCount, b_publishDate: @book.b_publishDate, b_publisher: @book.b_publisher, b_starNum: @book.b_starNum, b_thumb: @book.b_thumb, b_title: @book.b_title, b_totalStar: @book.b_totalStar, b_translator: @book.b_translator }
    end

    assert_redirected_to book_path(assigns(:book))
  end

  test "should show book" do
    get :show, id: @book
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @book
    assert_response :success
  end

  test "should update book" do
    patch :update, id: @book, book: { b_author: @book.b_author, b_belongCount: @book.b_belongCount, b_category: @book.b_category, b_date: @book.b_date, b_id: @book.b_id, b_likeCount: @book.b_likeCount, b_publishDate: @book.b_publishDate, b_publisher: @book.b_publisher, b_starNum: @book.b_starNum, b_thumb: @book.b_thumb, b_title: @book.b_title, b_totalStar: @book.b_totalStar, b_translator: @book.b_translator }
    assert_redirected_to book_path(assigns(:book))
  end

  test "should destroy book" do
    assert_difference('Book.count', -1) do
      delete :destroy, id: @book
    end

    assert_redirected_to books_path
  end
end
