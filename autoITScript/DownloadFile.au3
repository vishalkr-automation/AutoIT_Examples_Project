#include <InetConstants.au3>
#include <MsgBoxConstants.au3>
#include <WinAPIFiles.au3>

; Download a file in the background.
; Wait for the download to complete.

Example()

Func Example()


    ; Download the file in the background with the selected option of 'force a reload from the remote site.'
    Local $hDownload = InetGet("https://goo.gl/AtHQuv", "D:\Projects\AutoIT_Examples_Project\TestData\IEDriver.zip", $INET_FORCERELOAD)