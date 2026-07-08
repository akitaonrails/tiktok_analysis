package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import X.C013C;
import X.C1399580mWa;
import X.C201955140j;
import X.C201962140q;
import X.C2188811AlT;
import X.C389120FNm;
import X.InterfaceC1485080okU;
import X.InterfaceC20500415Jq;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.NewRepeatMusicPlayer;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes32.dex */
public final class NewRepeatMusicPlayer extends RepeatMusicPlayer {
    public InterfaceC20500415Jq LLJIJIL;
    public AVMusic LLJILJIL;

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer
    public final void LIZ(Context context, Uri uri) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer
    public final void LIZJ() {
        C201955140j.LIZLLL(C201962140q.LIZIZ, "NewRepeatMusicPlayer", "stopMusic");
        InterfaceC20500415Jq interfaceC20500415Jq = this.LLJIJIL;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.stop();
        }
        InterfaceC20500415Jq interfaceC20500415Jq2 = this.LLJIJIL;
        if (interfaceC20500415Jq2 != null) {
            interfaceC20500415Jq2.Of(null);
        }
        this.LLJIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer
    public final void onDestroy() {
        super.onDestroy();
        C201955140j.LIZLLL(C201962140q.LIZIZ, "NewRepeatMusicPlayer", "onDestroy");
        InterfaceC20500415Jq interfaceC20500415Jq = this.LLJIJIL;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.Of(null);
        }
        this.LLJIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer
    public final void LIZIZ(int i, int i2) {
        int duration;
        this.LLILLJJLI = i;
        if (C1399580mWa.LIZ()) {
            if (i2 == 0) {
                InterfaceC20500415Jq interfaceC20500415Jq = this.LLJIJIL;
                if (interfaceC20500415Jq != null) {
                    duration = interfaceC20500415Jq.getDuration();
                } else {
                    duration = 0;
                }
                this.LLILLL = duration;
            } else {
                this.LLILLL = i2;
            }
        }
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rePlay musicStart: ");
        sbLIZ.append(i);
        sbLIZ.append(" mMusicOnceTime: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", musicEnd: ");
        sbLIZ.append(i2);
        C201955140j.LIZLLL(c201962140q, "NewRepeatMusicPlayer", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20500415Jq interfaceC20500415Jq2 = this.LLJIJIL;
        if (interfaceC20500415Jq2 != null) {
            MusicModel musicModelLIZ = C389120FNm.LIZ(this.LLJILJIL);
            musicModelLIZ.playRepeatFromEndTime = true;
            interfaceC20500415Jq2.Zf(musicModelLIZ, 19, true, i, i + this.LLILZ);
        }
    }

    public NewRepeatMusicPlayer(Scene scene, String str, final int i, AVMusic aVMusic, final InterfaceC20500415Jq interfaceC20500415Jq) {
        super(i, scene, str);
        this.LLJIJIL = interfaceC20500415Jq;
        this.LLJILJIL = aVMusic;
        this.LLILZ = i;
        scene.getLifecycle().addObserver(this);
        if (interfaceC20500415Jq.isPlaying()) {
            interfaceC20500415Jq.stop();
        }
        final C013C c013c = new C013C();
        InterfaceC20500415Jq interfaceC20500415Jq2 = this.LLJIJIL;
        if (interfaceC20500415Jq2 != null) {
            interfaceC20500415Jq2.Of(new InterfaceC1485080okU() { // from class: X.15Jz
                /* JADX WARN: Type inference failed for: r3v1, types: [X.15K0, com.bytedance.scene.Scene] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC1485080okU
                public final void LIZ(float f, int i2) {
                    int i3;
                    int duration;
                    NewRepeatMusicPlayer newRepeatMusicPlayer;
                    int i4;
                    if (C1458070o2v.LJFF() && (i4 = (newRepeatMusicPlayer = this.LIZ).LLILLL) > 0) {
                        int i5 = newRepeatMusicPlayer.LLILLJJLI;
                        i3 = i + i5;
                        int i6 = i4 - i5;
                        if (i3 > i6) {
                            i3 = i6;
                        }
                    } else {
                        i3 = this.LIZ.LLILLJJLI + i;
                    }
                    if (i2 < i3 && f < 0.98f) {
                        c013c.element = false;
                        NewRepeatMusicPlayer newRepeatMusicPlayer2 = this.LIZ;
                        ?? r3 = newRepeatMusicPlayer2.LLJI;
                        if (r3 != 0) {
                            C15K3 c15k3 = newRepeatMusicPlayer2.LLIZ;
                            if (c15k3 != null) {
                                int i7 = newRepeatMusicPlayer2.LLILLL;
                                if (i7 > 0) {
                                    duration = i7 - newRepeatMusicPlayer2.LLILLJJLI;
                                } else {
                                    duration = interfaceC20500415Jq.getDuration();
                                }
                                if (c15k3.LIZ > 0) {
                                    i2 += c15k3.LIZIZ * duration;
                                }
                                r3.onProgress(i2);
                                return;
                            }
                            r3.onProgress(i2);
                            return;
                        }
                        return;
                    }
                    if (c013c.element) {
                        return;
                    }
                    NewRepeatMusicPlayer newRepeatMusicPlayer3 = this.LIZ;
                    C15K3 c15k32 = newRepeatMusicPlayer3.LLIZ;
                    if (c15k32 != null) {
                        c15k32.LIZIZ++;
                    }
                    interfaceC20500415Jq.Nf(newRepeatMusicPlayer3.LLILLJJLI, null);
                    c013c.element = true;
                }
            });
        }
    }
}
