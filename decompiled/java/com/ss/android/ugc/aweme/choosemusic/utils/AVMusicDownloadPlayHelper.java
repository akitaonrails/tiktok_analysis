package com.ss.android.ugc.aweme.choosemusic.utils;

import X.C01GW;
import X.C15JS;
import X.C202033143j;
import X.C20500615Js;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1485120okY;
import X.InterfaceC20499215Je;
import X.InterfaceC20499515Jh;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes32.dex */
public final class AVMusicDownloadPlayHelper extends MusicDownloadPlayHelper {
    public final InterfaceC20499515Jh LLJJJJLIIL;
    public final C01GW LLJJL;
    public BPEAHandler LLJJLIIIJLLLLLLLZ;
    public Toast LLJL;

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIIZ() {
        CountDownTimer countDownTimer = this.LLJJI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        InterfaceC20499215Je interfaceC20499215Je = this.LLILZ;
        if (interfaceC20499215Je != null) {
            interfaceC20499215Je.pause();
        }
        BPEAHandler bPEAHandler = this.LLJJLIIIJLLLLLLLZ;
        if (bPEAHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void Mf() {
        this.LLILZ.LJ(new InterfaceC1485120okY() { // from class: X.15JV
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                AVMusicDownloadPlayHelper aVMusicDownloadPlayHelper = this.LIZ;
                aVMusicDownloadPlayHelper.LLJJJJLIIL.J2(aVMusicDownloadPlayHelper.LLJILLL, 0L);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void onDestroy() {
        super.onDestroy();
        ((HandlerThread) this.LLJJL.getValue()).quit();
        BPEAHandler bPEAHandler = this.LLJJLIIIJLLLLLLLZ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LLILZ.LIZ(null);
        this.LLILZ.LIZJ(null);
        this.LLILZ.LJ(null);
        this.LLILZ.release();
    }

    public AVMusicDownloadPlayHelper(C20500615Js c20500615Js) {
        super(c20500615Js);
        this.LLJJJJLIIL = c20500615Js;
        this.LLJJL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(15));
        C202033143j c202033143j = new C202033143j(c20500615Js.LLILLL(), true, true, true, "av_record_player_music");
        c202033143j.LIZIZ.LJ = 1;
        this.LLILZIL = c202033143j;
        this.LLJJJJJIL = "av_record_player_music";
        Mf();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final boolean LIZ(Context context, MusicModel musicModel) {
        if (musicModel != null && !musicModel.isLocalMusic() && !musicModel.isPlayUrlValid()) {
            String string = context.getString(2131837774);
            Toast toast = this.LLJL;
            if (toast != null) {
                toast.cancel();
            }
            Toast toastMakeText = Toast.makeText(context, string, 0);
            toastMakeText.setGravity(17, 0, 0);
            this.LLJL = toastMakeText;
            C786410Ut5.re(toastMakeText);
            return false;
        }
        if (musicModel == null || musicModel.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = musicModel.getOfflineDesc();
        if (offlineDesc.length() == 0) {
            offlineDesc = context.getString(2131837770);
        }
        Toast toast2 = this.LLJL;
        if (toast2 != null) {
            toast2.cancel();
        }
        Toast toastMakeText2 = Toast.makeText(context, offlineDesc, 0);
        toastMakeText2.setGravity(17, 0, 0);
        this.LLJL = toastMakeText2;
        C786410Ut5.re(toastMakeText2);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIJ(MusicModel musicModel, boolean z, int i) {
        Zf(musicModel, i, z, 0, -1);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void Zf(MusicModel musicModel, int i, boolean z, final int i2, final int i3) {
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            this.LLJJLIIIJLLLLLLLZ = new BPEAHandler(C786410Ut5.W2((HandlerThread) this.LLJJL.getValue()), new Handler.Callback() { // from class: X.15JT
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    int i4 = message.what;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                ((HandlerThread) this.LL.LLJJL.getValue()).quit();
                                InterfaceC20499215Je interfaceC20499215Je = this.LL.LLILZ;
                                if (interfaceC20499215Je != null) {
                                    interfaceC20499215Je.release();
                                }
                            }
                        } else {
                            InterfaceC20499215Je interfaceC20499215Je2 = this.LL.LLILZ;
                            if (interfaceC20499215Je2 != null) {
                                interfaceC20499215Je2.pause();
                                return true;
                            }
                        }
                        return true;
                    }
                    C15JS c15js = (C15JS) HandlerHook.getMessageObj(message.obj);
                    super/*com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper*/.Zf(c15js.LIZ, c15js.LIZIZ, c15js.LIZJ, i2, i3);
                    return true;
                }
            });
        }
        BPEAHandler bPEAHandler = this.LLJJLIIIJLLLLLLLZ;
        if (bPEAHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = new C15JS(musicModel, z, i);
            C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
        }
    }
}
