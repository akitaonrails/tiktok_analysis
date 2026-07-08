package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import X.AbstractC1622390sJx;
import X.C01GW;
import X.C0N6I;
import X.C1449600npG;
import X.C1621190sI1;
import X.C1623370sLX;
import X.C1624200sMs;
import X.C1627370sRz;
import X.C1630230sWb;
import X.C1645740svc;
import X.C19EG;
import X.C19GS;
import X.C21357118i1;
import X.C21357318i3;
import X.C21357918i9;
import X.C21361718il;
import X.C21364318jB;
import X.C21364418jC;
import X.C452501pT;
import X.C522610KeZ;
import X.C530260Kqu;
import X.C535310Kz3;
import X.C537070L4n;
import X.C537080L4o;
import X.C540200LGo;
import X.C579040MnO;
import X.EnumC1155090gAF;
import X.InterfaceC1159800gHq;
import X.InterfaceC1624480sNK;
import X.InterfaceC1635880sfi;
import X.InterfaceC212356188k;
import X.InterfaceC21358118iB;
import X.InterfaceC21360318iX;
import X.InterfaceC21362718iv;
import X.InterfaceC21363618j4;
import X.InterfaceC21363918j7;
import X.InterfaceC21364218jA;
import X.InterfaceC21364618jE;
import X.InterfaceC524950KiL;
import X.InterfaceC540220LGq;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS241S0300000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import qtk.c;

/* JADX INFO: loaded from: classes33.dex */
public final class DiyPropVideoStickerHandler extends AbstractC1622390sJx implements InterfaceC1159800gHq, InterfaceC1635880sfi, GenericLifecycleObserver {
    public final C19EG LLILLJJLI;
    public final InterfaceC1624480sNK LLILLL;
    public final String LLILZ;
    public final InterfaceC524950KiL LLILZIL;
    public final Function1<Effect, Boolean> LLIZ;
    public final InterfaceC21364618jE LLIZLLLIL;
    public final InterfaceC21364218jA LLJ;
    public final InterfaceC21363618j4 LLJI;
    public final InterfaceC540220LGq LLJIJIL;
    public final InterfaceC21363918j7 LLJILJIL;
    public final Function0<Unit> LLJILJILJ;
    public final InterfaceC21360318iX LLJILLL;
    public final Function2<Context, Integer, Unit> LLJJ;
    public final Function1<Effect, DiyPropUploadVideoAutoCutConfigure> LLJJI;
    public final InterfaceC21358118iB LLJJIII;
    public C21357318i3 LLJJIJI;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public Effect LLJJJJ;
    public AwS433S0200000_32 LLJJJJLIIL;
    public final MutableLiveData<Boolean> LLJJL;
    public final MutableLiveData LLJJLIIIJLLLLLLLZ;
    public final List<InterfaceC21362718iv> LLJL;
    public final C21361718il LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final boolean LLILZLL = true;
    public final long LLJJIJIIJIL = 1000;
    public String LLJJIJIL = "";
    public final List<String> LLJJJJJIL = new ArrayList();

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        this.LLJJJ = false;
        C21357318i3 c21357318i3 = this.LLJJIJI;
        if (c21357318i3 != null) {
            c21357318i3.LJIIJ();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        C21357318i3 c21357318i3;
        List<InterfaceC21362718iv> list = this.LLJL;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC21362718iv) it2.next()).LIZ()) {
                    return;
                }
            }
        }
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLILLL;
        if ((interfaceC1624480sNK == null || Intrinsics.LJFF(interfaceC1624480sNK.LLILIL(), this.LLJJJJ)) && (c21357318i3 = this.LLJJIJI) != null) {
            this.LLJJJ = true;
            c21357318i3.LJIJI(this.LLJJJIL, null, null);
            if (!((ArrayList) this.LLJJJJJIL).isEmpty()) {
                if (!C522610KeZ.LIZ()) {
                    c21357318i3.LJJI.scrollToPosition(0);
                    return;
                }
                String str = this.LLJJIJIL;
                if (str == null || str.length() == 0) {
                    c21357318i3.LJJI.scrollToPosition(0);
                } else {
                    c21357318i3.LJJII(this.LLJJIJIL);
                }
            }
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        C21357318i3 c21357318i3;
        if (ChangeImagePickerUIExperiment.isEnabled() && (c21357318i3 = this.LLJJIJI) != null) {
            c21357318i3.LIZLLL();
        }
        this.LLJLIL.LIZIZ.cancel();
        this.LLJJJJLIIL = null;
        this.LLJJIJIL = "";
        Effect effect = this.LLJJJJ;
        if (effect != null) {
            this.LLJ.LIZIZ(effect);
        }
        this.LLJJJJ = null;
        C21357318i3 c21357318i32 = this.LLJJIJI;
        if (c21357318i32 != null) {
            c21357318i32.LJIJJ();
        }
        LJFF();
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLJL).add(c579040MnO);
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLJL).remove(c579040MnO);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        this.LLJJJIL = true;
        if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE && this.LLJJJJ != null && !this.LLJJJ) {
            LJIIJ();
            InterfaceC21360318iX interfaceC21360318iX = this.LLJILLL;
            interfaceC21360318iX.LIZIZ();
            interfaceC21360318iX.LIZLLL(50, new C21357118i1(this));
        }
        C21357318i3 c21357318i3 = this.LLJJIJI;
        if (c21357318i3 != null) {
            c21357318i3.LIZIZ();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.wbs);
        if (viewStubCompat != null) {
            viewStubCompat.setLayoutResource(R.layout.i66);
            View viewLIZ = viewStubCompat.LIZ();
            if (viewLIZ != null) {
                boolean z = this.LLILZLL;
                C19EG c19eg = this.LLILLJJLI;
                InterfaceC21358118iB interfaceC21358118iB = this.LLJJIII;
                this.LLJJIJI = new C21357318i3(viewLIZ, null, null, z, null, null, null, null, (ViewGroup) view.findViewById(R.id.f760net), null, AFwS223S0000000_32.get$arr$(108), c19eg, interfaceC21358118iB, new InterfaceC212356188k() { // from class: X.18ix
                    @Override // X.InterfaceC212356188k
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LJ(List<C1621190sI1> list, Map<C21356918hz, Integer> map) {
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LJFF(List<C1621190sI1> list) {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[PHI: r1
                      0x005a: PHI (r1v4 X.0KiL) = (r1v3 X.0KiL), (r1v8 X.0KiL) binds: [B:13:0x004e, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC212356188k
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJI() throws java.lang.Throwable {
                        /*
                            r6 = this;
                            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r6.LIZ
                            X.18j7 r2 = r0.LLJILJIL
                            kotlin.jvm.functions.Function1<com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure> r1 = r0.LLJJI
                            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LLJJJJ
                            java.lang.Object r0 = r1.invoke(r0)
                            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure r0 = (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure) r0
                            r3 = 0
                            android.os.Bundle r2 = r2.LIZIZ(r0, r3)
                            boolean r0 = com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment.isEnabled()
                            if (r0 != 0) goto L1f
                            boolean r0 = X.C522610KeZ.LIZ()
                            if (r0 == 0) goto L3c
                        L1f:
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r1.<init>()
                            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r6.LIZ
                            java.lang.String r0 = r0.LLJJIJIL
                            if (r0 == 0) goto L37
                            int r0 = r0.length()
                            if (r0 == 0) goto L37
                            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r6.LIZ
                            java.lang.String r0 = r0.LLJJIJIL
                            r1.add(r0)
                        L37:
                            java.lang.String r0 = "key_selected_video_path"
                            X.C786410Ut5.LJJJIL(r2, r0, r1)
                        L3c:
                            X.0sj5 r1 = X.C1660670tJh.LIZ()
                            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r6.LIZ
                            X.19EG r0 = r0.LLILLJJLI
                            r5 = 10002(0x2712, float:1.4016E-41)
                            android.content.Intent r4 = r1.LIZIZ(r0, r2, r5)
                            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r2 = r6.LIZ
                            X.0KiL r1 = r2.LLILZIL
                            if (r1 != 0) goto L5a
                            X.19EG r1 = r2.LLILLJJLI
                            boolean r0 = r1 instanceof X.InterfaceC524950KiL
                            if (r0 == 0) goto L70
                            X.0KiL r1 = (X.InterfaceC524950KiL) r1
                            if (r1 == 0) goto L70
                        L5a:
                            X.01GW r0 = r2.LLJLILLLLZIIL
                            java.lang.Object r0 = r0.getValue()
                            X.0IyZ r0 = (X.InterfaceC484050IyZ) r0
                            r1.T4(r0)
                            X.01GW r0 = r2.LLJLILLLLZIIL
                            java.lang.Object r0 = r0.getValue()
                            X.0IyZ r0 = (X.InterfaceC484050IyZ) r0
                            r1.Qh(r0)
                        L70:
                            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r6.LIZ
                            X.19EG r2 = r0.LLILLJJLI
                            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
                            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()
                            java.lang.String r0 = "Activity_startActivityForResult_2"
                            r1.dispatchActivityOpReached(r2, r4, r0)
                            X.C1701330uNH.LIZ(r4, r2)
                            X.0WZX r1 = new X.0WZX
                            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcQRoUahUtPeDnSt3OObg9qawdkXFx7KrQ/regKy4rO0VgnGyAVraNRCdp"
                            r1.<init>(r0, r3)
                            X.C2204961BRm.LLJJJJJIL(r5, r4, r2, r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21362918ix.LJI():void");
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LJIIL() {
                        DiyPropVideoStickerHandler diyPropVideoStickerHandler = this.LIZ;
                        diyPropVideoStickerHandler.LLJJIJIL = "";
                        Effect effect = diyPropVideoStickerHandler.LLJJJJ;
                        if (effect != null) {
                            diyPropVideoStickerHandler.LLJ.LIZIZ(effect);
                            C522610KeZ.LIZ();
                        }
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LIZJ(C21356918hz c21356918hz, C21355818ho c21355818ho) {
                        if (c21356918hz != null) {
                            DiyPropVideoStickerHandler diyPropVideoStickerHandler = this.LIZ;
                            diyPropVideoStickerHandler.LLIZLLLIL.LIZ(c21356918hz.LIZJ(), diyPropVideoStickerHandler.LLJJIJIIJIL, new AwS241S0300000_32(c21355818ho, c21356918hz, diyPropVideoStickerHandler, c21356918hz, 4), new AwS398S0200000_32(c21355818ho, diyPropVideoStickerHandler, 35));
                        }
                    }
                }, new AwS611S0100000_32(this, 177), C0N6I.VIDEO, (ComposeView) view.findViewById(R.id.kfk), this.LLILLL, new AwS576S0100000_32(this, 336), null, null, 2098678);
            }
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        this.LLJJJIL = false;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        C21357318i3 c21357318i3;
        Effect effect = c1627370sRz.LIZ;
        if (!Intrinsics.LJFF(effect, this.LLJJJJ)) {
            this.LLJJIJIL = "";
            Effect effect2 = this.LLJJJJ;
            if (effect2 != null) {
                this.LLJ.LIZIZ(effect2);
            }
        }
        if (ChangeImagePickerUIExperiment.isEnabled() && (c21357318i3 = this.LLJJIJI) != null) {
            c21357318i3.LJJIJIL = effect;
            C1630230sWb.LIZLLL = !C1449600npG.LJFF(effect);
            C1630230sWb.LIZJ = C1624200sMs.LIZLLL(effect);
        }
        return this.LLIZ.invoke(effect).booleanValue();
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLJJJJLIIL = new AwS433S0200000_32(this, c1627370sRz, 59);
        this.LLJJJJ = c1627370sRz.LIZ;
        this.LLJLIL.LIZ(this.LLJIJIL, this.LLILLJJLI, new AwS576S0100000_32(this, 337));
        this.LLJ.LIZJ(this.LLJJJJ);
    }

    public final boolean LJJIIJ(int i, int i2, Intent intent, Function1<? super Intent, C21364318jB> function1) {
        if (i != 10002) {
            return false;
        }
        if (i2 == -1) {
            if (intent != null) {
                C21364418jC c21364418jC = function1.invoke(intent).LIZIZ;
                String str = c21364418jC.LIZ;
                String str2 = c21364418jC.LIZJ;
                if (str2 != null) {
                    this.LLJJIJIL = str2;
                    if (ChangeImagePickerUIExperiment.isEnabled()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C1621190sI1(1, this.LLJJIJIL, "", "", "media_tray"));
                        C21357918i9.LIZJ(arrayList);
                        C21357318i3 c21357318i3 = this.LLJJIJI;
                        if (c21357318i3 != null) {
                            c21357318i3.LJIILL();
                        }
                    }
                }
                if (str != null) {
                    this.LLJ.LIZ(str);
                }
            }
            if (((ArrayList) this.LLJJJJJIL).contains(this.LLJJIJIL)) {
                C21357318i3 c21357318i32 = this.LLJJIJI;
                if (c21357318i32 != null) {
                    c21357318i32.LJII(this.LLJJIJIL, false);
                    return true;
                }
                return true;
            }
            C21357318i3 c21357318i33 = this.LLJJIJI;
            if (c21357318i33 == null) {
                return true;
            }
            c21357318i33.LJIJJ();
            return true;
        }
        return true;
    }

    public DiyPropVideoStickerHandler(C19GS c19gs, InterfaceC1624480sNK interfaceC1624480sNK, String str, InterfaceC524950KiL interfaceC524950KiL, AFwS266S0000000_25 aFwS266S0000000_25, C530260Kqu c530260Kqu, C1645740svc c1645740svc, C537070L4n c537070L4n, C540200LGo c540200LGo, C537080L4o c537080L4o, AwS552S0100000_8 awS552S0100000_8, C535310Kz3 c535310Kz3, AFwS291S0000000_8 aFwS291S0000000_8, AFwS266S0000000_25 aFwS266S0000000_252, c cVar) {
        this.LLILLJJLI = c19gs;
        this.LLILLL = interfaceC1624480sNK;
        this.LLILZ = str;
        this.LLILZIL = interfaceC524950KiL;
        this.LLIZ = aFwS266S0000000_25;
        this.LLIZLLLIL = c530260Kqu;
        this.LLJ = c1645740svc;
        this.LLJI = c537070L4n;
        this.LLJIJIL = c540200LGo;
        this.LLJILJIL = c537080L4o;
        this.LLJILJILJ = awS552S0100000_8;
        this.LLJILLL = c535310Kz3;
        this.LLJJ = aFwS291S0000000_8;
        this.LLJJI = aFwS266S0000000_252;
        this.LLJJIII = cVar;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJJL = mutableLiveData;
        this.LLJJLIIIJLLLLLLLZ = mutableLiveData;
        this.LLJL = new ArrayList();
        this.LLJLIL = new C21361718il();
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 602));
    }
}
