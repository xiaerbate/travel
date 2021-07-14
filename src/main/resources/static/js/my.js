function myajax(type,url,data,fn) {
    $.ajax({
        type: type,
        url: url,
        data: data,
        dataType: 'json',
        success: function (res) {
            $('#message').html(`
                <div class="alert alert-success myMessage" role="alert">
                <button type="button" class="close" data-dismiss="alert"
                 aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                `+res.message+`
               </div>
            `)
            setTimeout(function () {
                $('#message').html('')
            }, 1500)
            if (!fn){
                return
            }
            fn(res)
        },
        error:function () {
            $('#message').html(`
                <div class="alert alert-danger myMessage" role="alert">
                <button type="button" class="close" data-dismiss="alert"
                 aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                请求失败
               </div>
            `)
            setTimeout(function () {
                $('#message').html('')
            }, 1500)
        }
    })
}