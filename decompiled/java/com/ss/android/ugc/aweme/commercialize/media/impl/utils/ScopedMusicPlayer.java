package com.ss.android.ugc.aweme.commercialize.media.impl.utils;

import X.C0VSJ;
import X.C0XF1;
import X.C1233040iBy;
import X.C128B;
import X.C128C;
import X.C128D;
import X.C1839090xxT;
import X.C1839100xxU;
import X.C1839110xxV;
import X.C19744212Mu;
import X.C1BNE;
import X.C202033143j;
import X.C20498815Ja;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2344809Gs;
import X.C2354709Kn;
import X.InterfaceC1485100okW;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes30.dex */
public final class ScopedMusicPlayer implements LifecycleEventObserver, C128D {
    public final LifecycleOwner LL;
    public final C128C LLILZIL;
    public boolean LLIZ;
    public final boolean LLILLJJLI = true;
    public final C2252321DDq LLILLL = C1BNE.LIZ(C1839110xxV.LIZ);
    public final C20498815Ja LLILZ = new C20498815Ja("music_detail_page_ai_recommend_music");
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);

    public final void pause() {
        this.LLILLL.setValue(C1839110xxV.LIZ);
        this.LLILZ.pause();
    }

    @Override // X.C128D
    public final void LIZ(MusicModel musicModel) {
        if (!this.LLIZ) {
            this.LLILLL.setValue(C1839110xxV.LIZ);
        } else {
            this.LLILZ.LIZIZ(C19744212Mu.LIZJ(musicModel));
            this.LLILLL.setValue(new C1839100xxU(musicModel));
        }
    }

    public final void LIZIZ(MusicModel musicModel) {
        if (!this.LLILZLL.getAndSet(true)) {
            this.LL.getLifecycle().addObserver(this);
            this.LLILZ.LIZ(new InterfaceC1485100okW() { // from class: X.0Xs7
                @Override // X.InterfaceC1485100okW
                public final void LIZIZ() {
                    ScopedMusicPlayer scopedMusicPlayer = this.LIZ;
                    if (scopedMusicPlayer.LLILLJJLI) {
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(scopedMusicPlayer.LL), null, null, new C862240Xs6(this.LIZ, null), 3);
                    } else {
                        scopedMusicPlayer.LLILLL.setValue(C1839110xxV.LIZ);
                    }
                }
            });
        }
        String localPath = musicModel.getLocalPath();
        if (localPath != null && localPath.length() != 0) {
            String strLIZ = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LIZ(musicModel);
            if (!TextUtils.isEmpty(strLIZ) && C2354709Kn.LIZIZ(strLIZ) && new C0VSJ(strLIZ).length() > 0 && strLIZ != null) {
                this.LLILLL.setValue(new C1839100xxU(musicModel));
                this.LLILZ.LIZIZ(C19744212Mu.LIZJ(musicModel));
                return;
            }
        }
        this.LLILLL.setValue(new C1839090xxT(musicModel));
        C128C c128c = this.LLILZIL;
        c128c.LIZ.pause();
        Context context = c128c.LIZJ;
        if (context != null) {
            if (!C0XF1.LIZLLL(context)) {
                C1233040iBy c1233040iBy = new C1233040iBy(c128c.LIZJ);
                c1233040iBy.LIZIZ(2131837962);
                c1233040iBy.LIZLLL();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ID：");
                sbLIZ.append(musicModel.getId());
                C2344809Gs.LIZLLL(4, "Music Download", C2188811AlT.LIZIZ(sbLIZ));
                C202033143j c202033143j = c128c.LIZIZ;
                c202033143j.LIZIZ.LIZIZ(musicModel, new C128B(c128c, musicModel), true, false, false);
            }
        }
        this.LLILZ.pause();
    }

    public ScopedMusicPlayer(Context context, LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        this.LLILZIL = new C128C(context, this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            this.LLIZ = false;
            pause();
        } else {
            if (event != Lifecycle.Event.ON_RESUME) {
                return;
            }
            this.LLIZ = true;
        }
    }
}
