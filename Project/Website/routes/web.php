<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');
Route::get('admin/routes','HomeController@admin')->middleware('admin');

Route::get('/home', function () {
    return view('home');
});

//routes sarpras
Route::get('/sarpras/index', function () {
    return view('/sarpras/index');
});
Route::get('/sarpras/fpengajuan', function () {
	return view('/sarpras/fpengajuan');
});
Route::get('/Form_Pengajuan', function () {
    return view('/sarpras/fpengajuan');
});
Route::get('/sarpras/vendor',function(){
	return view('/sarpras/vendor');
});
Route::get('/sarpras/approval',function(){
	return view('/sarpras/approval');
});
Route::get('/sarpras/inventory',function(){
	return view('/sarpras/inventory');
});
Route::get('/sarpras/checkout',function(){
	return view('/sarpras/checkout');
});
Route::get('/sarpras/report',function(){
	return view('/sarpras/report');
});
Route::get('/sarpras/pbjk',function(){
	return view('/sarpras/pbjk');
});
Route::get('/sarpras/pbjnk',function(){
	return view('/sarpras/pbjnk');
});
// end routes sarpras

//routes yayasan
Route::get('/yayasan/index', function () {
    return view('/yayasan/index');
});
Route::get('/yayasan/fpengajuan', function () {
    return view('/yayasan/fpengajuan');
});
Route::get('/yayasan/vendor',function(){
	return view('/yayasan/vendor');
});
Route::get('/yayasan/approval',function(){
	return view('/yayasan/approval');
});
Route::get('/yayasan/inventory',function(){
	return view('/yayasan/inventory');
});
Route::get('/yayasan/checkout',function(){
	return view('/yayasan/checkout');
});
Route::get('/yayasan/report',function(){
	return view('/yayasan/report');
});
Route::get('/yayasan/pbjk',function(){
	return view('/yayasan/pbjk');
});
Route::get('/yayasan/pbjnk',function(){
	return view('/yayasan/pbjnk');
});
Route::get('/yayasan/user',function(){
	return view('/yayasan/user');
});
// end routes yayasan

//routes wakasek
Route::get('/wakasek/index', function () {
    return view('/wakasek/index');
});
Route::get('/wakasek/fpengajuan', function () {
    return view('/wakasek/fpengajuan');
});
Route::get('/wakasek/approval',function(){
	return view('/wakasek/approval');
});
Route::get('/wakasek/pbjk',function(){
	return view('/wakasek/pbjk');
});
Route::get('/wakasek/pbjnk',function(){
	return view('/wakasek/pbjnk');
});
// end routes wakasek

//routes kepsek
Route::get('/kepsek/index', function () {
    return view('/kepsek/index');
});
Route::get('/kepsek/fpengajuan', function () {
    return view('/kepsek/fpengajuan');
});
Route::get('/kepsek/approval',function(){
	return view('/kepsek/approval');
});
Route::get('/kepsek/pbjk',function(){
	return view('/kepsek/pbjk');
});
Route::get('/kepsek/pbjnk',function(){
	return view('/kepsek/pbjnk');
});
// end routes kepsek

//routes pengaju
Route::get('/pengaju/index', function () {
    return view('/pengaju/index');
});
Route::get('/pengaju/fpengajuan', function () {
    return view('/pengaju/fpengajuan');
});
Route::get('/pengaju/approval',function(){
	return view('/pengaju/approval');
});
Route::get('/pengaju/pbjk',function(){
	return view('/pengaju/pbjk');
});
Route::get('/pengaju/pbjnk',function(){
	return view('/pengaju/pbjnk');
});
// end routes pengaju

//routes keuangan
Route::get('/keuangan/index', function () {
    return view('/keuangan/index');
});
Route::get('/keuangan/fpengajuan', function () {
    return view('/keuangan/fpengajuan');
});
Route::get('/keuangan/vendor',function(){
	return view('/keuangan/vendor');
});
Route::get('/keuangan/approval',function(){
	return view('/keuangan/approval');
});
Route::get('/keuangan/inventory',function(){
	return view('/keuangan/inventory');
});
Route::get('/keuangan/checkout',function(){
	return view('/keuangan/checkout');
});
Route::get('/keuangan/report',function(){
	return view('/keuangan/report');
});
Route::get('/keuangan/pbjk',function(){
	return view('/keuangan/pbjk');
});
Route::get('/keuangan/pbjnk',function(){
	return view('/keuangan/pbjnk');
});
// end routes keuangan
