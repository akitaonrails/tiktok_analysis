package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import X.AbstractC1622390sJx;
import X.C01GW;
import X.C09I5;
import X.C0L1L;
import X.C0MZV;
import X.C0N6I;
import X.C0PEM;
import X.C123100dR;
import X.C1446130njf;
import X.C1449600npG;
import X.C1621190sI1;
import X.C1621630sIj;
import X.C1624200sMs;
import X.C1624570sNT;
import X.C1627370sRz;
import X.C1630230sWb;
import X.C19EG;
import X.C21356918hz;
import X.C21357218i2;
import X.C21357318i3;
import X.C21357918i9;
import X.C21358618iG;
import X.C21361618ik;
import X.C21361718il;
import X.C21363018iy;
import X.C21363118iz;
import X.C21363218j0;
import X.C21363318j1;
import X.C21364318jB;
import X.C21364418jC;
import X.C23250099c;
import X.C452501pT;
import X.C522610KeZ;
import X.C530260Kqu;
import X.C537070L4n;
import X.C537080L4o;
import X.C537120L4s;
import X.C537130L4t;
import X.C579040MnO;
import X.C785410UrT;
import X.EnumC1155090gAF;
import X.InterfaceC1159800gHq;
import X.InterfaceC1456340o08;
import X.InterfaceC1623110sL7;
import X.InterfaceC1624480sNK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1635880sfi;
import X.InterfaceC1670800ta2;
import X.InterfaceC1685420txc;
import X.InterfaceC212356188k;
import X.InterfaceC21358218iC;
import X.InterfaceC21358718iH;
import X.InterfaceC21360318iX;
import X.InterfaceC21361218ig;
import X.InterfaceC21362118ip;
import X.InterfaceC21362218iq;
import X.InterfaceC21362718iv;
import X.InterfaceC21363518j3;
import X.InterfaceC21363618j4;
import X.InterfaceC21363918j7;
import X.InterfaceC21364618jE;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC540220LGq;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.ab.GreenScreenEffectsAIGCInfoFixKillSwitch;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS241S0300000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS657S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class BackgroundVideoStickerPresenter extends AbstractC1622390sJx implements InterfaceC1159800gHq, InterfaceC1635880sfi, InterfaceC1623110sL7, GenericLifecycleObserver {
    public static final /* synthetic */ int LLLLIIL = 0;
    public final C19EG LLILLJJLI;
    public final InterfaceC1624480sNK LLILLL;
    public final String LLILZ;
    public final InterfaceC524950KiL LLILZIL;
    public final InterfaceC1456340o08<InterfaceC21363518j3> LLILZLL;
    public final InterfaceC21361218ig LLIZ;
    public final InterfaceC21358218iC LLIZLLLIL;
    public final Function1<Integer, InterfaceC21360318iX> LLJ;
    public final InterfaceC21363918j7 LLJI;
    public final InterfaceC21363618j4 LLJIJIL;
    public final InterfaceC21362218iq LLJILJIL;
    public final InterfaceC21364618jE LLJILJILJ;
    public final Function2<Context, Integer, Unit> LLJILLL;
    public final InterfaceC540220LGq LLJJ;
    public final Function0<Boolean> LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final LifecycleOwner LLJJIJIIJIL;
    public final Function0<Boolean> LLJJIJIL;
    public final InterfaceC1631620sYq<String, String, Boolean, Unit> LLJJJ;
    public final InterfaceC21358718iH LLJJJIL;
    public final InterfaceC1685420txc<String, String, Integer, Integer, Function1<? super Boolean, Unit>, Unit> LLJJJJ;
    public final Function1<MediaModel, Unit> LLJJJJJIL;
    public final Function1<C0MZV, Unit> LLJJJJLIIL;
    public final InterfaceC1631620sYq<Effect, Handler, DialogInterface.OnDismissListener, Dialog> LLJJL;
    public final Function2<Effect, ViewGroup, InterfaceC21362118ip> LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public C21357318i3 LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public Dialog LLLI;
    public InterfaceC21362118ip LLLII;
    public FrameLayout LLLIIII;
    public Effect LLLIIIIL;
    public boolean LLLIIIL;
    public final List<String> LLLIIL;
    public final C01GW LLLIILIL;
    public C21356918hz LLLIL;
    public final List<InterfaceC21362718iv> LLLILZ;
    public int LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final MutableLiveData<Boolean> LLLIZZ;
    public final MutableLiveData LLLJ;
    public final C21361718il LLLJIL;
    public InterfaceC21360318iX LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;

    public BackgroundVideoStickerPresenter() {
        throw null;
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        this.LLLFF = false;
        this.LLLFFI = false;
        C21357318i3 c21357318i3 = this.LLLF;
        if (c21357318i3 != null) {
            c21357318i3.LJIIJ();
        }
        this.LLJJJIL.LIZJ(this.LLLIIIIL);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        InterfaceC524950KiL interfaceC524950KiL = this.LLILZIL;
        if (interfaceC524950KiL == null) {
            InterfaceC1670800ta2 interfaceC1670800ta2 = this.LLILLJJLI;
            if (!(interfaceC1670800ta2 instanceof InterfaceC524950KiL) || (interfaceC524950KiL = (InterfaceC524950KiL) interfaceC1670800ta2) == null) {
                return;
            }
        }
        interfaceC524950KiL.T4((InterfaceC484050IyZ) this.LLLILZLLLI.getValue());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        this.LLILZLL.get().LIZJ();
        if (C21363018iy.LJI(this.LLLIIIIL) && C123100dR.LIZ(this.LLJLILLLLZIIL)) {
            this.LLILZLL.get().LJIIJ(0L, C21363018iy.LIZLLL("BACKGROUND"));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        if (C21363018iy.LJI(this.LLLIIIIL) && C123100dR.LIZ(this.LLJLILLLLZIIL)) {
            this.LLJZIJLIL = true;
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        List<InterfaceC21362718iv> list = this.LLLILZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC21362718iv) it2.next()).LIZ()) {
                    return;
                }
            }
        }
        if (C1624570sNT.LJIJ(this.LLLIIIIL)) {
            C21357318i3 c21357318i3 = this.LLLF;
            if (c21357318i3 != null) {
                c21357318i3.LJIIJ();
                return;
            }
            return;
        }
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLILLL;
        if (interfaceC1624480sNK == null || Intrinsics.LJFF(interfaceC1624480sNK.LLILIL(), this.LLLIIIIL)) {
            C21357318i3 c21357318i32 = this.LLLF;
            if (c21357318i32 == null) {
                this.LLLFFI = true;
                return;
            }
            if (!this.LLLFF) {
                this.LLJJJIL.LJFF(this.LLLIIIIL);
            }
            this.LLLFF = true;
            c21357318i32.LJIJI(this.LLLIIIL, null, null);
            this.LLL = false;
            if (!((ArrayList) this.LLLIIL).isEmpty()) {
                if (!C522610KeZ.LIZ()) {
                    c21357318i32.LJJI.scrollToPosition(0);
                    return;
                }
                String str = this.LLJLIL;
                if (str == null || str.length() == 0) {
                    c21357318i32.LJJI.scrollToPosition(0);
                } else {
                    c21357318i32.LJJII(this.LLJLIL);
                }
            }
        }
    }

    public final void LJJIIJZLJL() {
        if (GreenScreenEffectsAIGCInfoFixKillSwitch.INSTANCE.isEnabled()) {
            return;
        }
        this.LLILZLL.get().LIZIZ(null);
    }

    public final Long LJJIIZ() {
        Effect effect;
        Effect effect2 = this.LLLIIIIL;
        if (!(effect2 != null && C1449600npG.LJIIIIZZ(effect2)) || (effect = this.LLLIIIIL) == null) {
            return null;
        }
        C1446130njf.LIZ.getClass();
        JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
        if (jSONObjectLJIIIZ == null || !jSONObjectLJIIIZ.has("AIGCV2VVideoInputMaxDuration")) {
            return null;
        }
        Long lValueOf = Long.valueOf(jSONObjectLJIIIZ.optLong("AIGCV2VVideoInputMaxDuration"));
        if (lValueOf.longValue() > 0) {
            return Long.valueOf(lValueOf.longValue() * 1000);
        }
        return null;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        C21357318i3 c21357318i3;
        if (ChangeImagePickerUIExperiment.isEnabled() && (c21357318i3 = this.LLLF) != null) {
            c21357318i3.LIZLLL();
        }
        LJJIJLIJ(false);
        this.LLLJIL.LIZIZ.cancel();
        this.LLLIIIIL = null;
        this.LLJL = 2;
        this.LLJLIL = "";
        this.LLJLILLLLZIIL = "";
        this.LLJLL = "";
        LJJIIJZLJL();
        this.LLILZLL.get().LJFF();
        InterfaceC21362118ip interfaceC21362118ip = this.LLLII;
        if (interfaceC21362118ip != null) {
            interfaceC21362118ip.LIZ();
        }
        Dialog dialog = this.LLLI;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
        C21357318i3 c21357318i32 = this.LLLF;
        if (c21357318i32 != null) {
            c21357318i32.LJIJJ();
        }
        LJFF();
    }

    public final void LJJIIZI() {
        String effectId;
        LJIIJ();
        C21361618ik c21361618ik = (C21361618ik) this.LLLIILIL.getValue();
        c21361618ik.LIZIZ();
        c21361618ik.LIZ = "video";
        c21361618ik.LIZIZ = System.currentTimeMillis();
        Effect effect = this.LLLIIIIL;
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        c21361618ik.LJIIIIZZ = effectId;
        Effect effect2 = this.LLLIIIIL;
        if (effect2 != null) {
            effect2.getResourceId();
        }
        this.LLLJL.LIZIZ();
        c21361618ik.LJFF = 50;
        InterfaceC21360318iX interfaceC21360318iX = this.LLLJL;
        interfaceC21360318iX.LIZIZ();
        interfaceC21360318iX.LIZLLL(50, new C21357218i2(this));
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        return this.LLLFF;
    }

    public static boolean LJJIJ(String str) {
        String lowerCase;
        String lowerCase2 = null;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (!Intrinsics.LJFF(lowerCase, "image/jpeg")) {
            if (str != null) {
                lowerCase2 = str.toLowerCase(Locale.ROOT);
            }
            if (!Intrinsics.LJFF(lowerCase2, "image/png")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLLILZ).add(c579040MnO);
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLLILZ).remove(c579040MnO);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        this.LLLIIIL = true;
        if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE && this.LLLIIIIL != null && !this.LLLFF) {
            LJJIIZI();
        }
        C21357318i3 c21357318i3 = this.LLLF;
        if (c21357318i3 != null) {
            c21357318i3.LIZIZ();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        Effect effect;
        this.LLLIIII = (FrameLayout) view.findViewById(R.id.rpx);
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.wbm);
        if (viewStubCompat != null) {
            viewStubCompat.setLayoutResource(R.layout.i66);
            View viewLIZ = viewStubCompat.LIZ();
            if (viewLIZ != null) {
                viewLIZ.getLayoutParams();
                this.LLLF = new C21357318i3(viewLIZ, null, null, this.LLJJIII, null, null, null, null, null, null, null, this.LLILLJJLI, null, new InterfaceC212356188k() { // from class: X.18iw
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

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x0172 A[PHI: r3
                      0x0172: PHI (r3v5 X.0KiL) = (r3v4 X.0KiL), (r3v9 X.0KiL) binds: [B:59:0x0166, B:63:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC212356188k
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJI() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 565
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21362818iw.LJI():void");
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LJIIL() {
                        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter;
                        Effect effect2;
                        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter2 = this.LIZ;
                        backgroundVideoStickerPresenter2.LLJLIL = "";
                        backgroundVideoStickerPresenter2.LLJLILLLLZIIL = "";
                        backgroundVideoStickerPresenter2.LJJIJLIJ(false);
                        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter3 = this.LIZ;
                        backgroundVideoStickerPresenter3.LLJJJIL.LIZLLL(backgroundVideoStickerPresenter3.LLLIIIIL);
                        if (!C21363018iy.LJI(this.LIZ.LLLIIIIL) && (effect2 = (backgroundVideoStickerPresenter = this.LIZ).LLLIIIIL) != null) {
                            backgroundVideoStickerPresenter.LLILZLL.get().LIZLLL(effect2);
                        }
                        if (C522610KeZ.LIZ()) {
                            this.LIZ.LLLIL = null;
                        }
                    }

                    @Override // X.InterfaceC212356188k
                    public final void LIZJ(C21356918hz c21356918hz, C21355818ho c21355818ho) {
                        if (c21356918hz != null) {
                            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.LIZ;
                            int i = c21356918hz.LJI;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 4) {
                                        backgroundVideoStickerPresenter.LLJJJJJIL.invoke(c21356918hz.LIZJ());
                                        c21355818ho.onSuccess();
                                        backgroundVideoStickerPresenter.LLJJJIL.LJI(backgroundVideoStickerPresenter.LLLIIIIL, "toolbar", true);
                                        backgroundVideoStickerPresenter.LJJIJIL(c21356918hz.LJIILIIL, c21356918hz.LIZIZ);
                                    }
                                } else {
                                    backgroundVideoStickerPresenter.LLJILJILJ.LIZ(c21356918hz.LIZJ(), 1000L, new AwS241S0300000_32(c21355818ho, c21356918hz, backgroundVideoStickerPresenter, 3), new AwS398S0200000_32(c21355818ho, backgroundVideoStickerPresenter, 34));
                                }
                            } else {
                                backgroundVideoStickerPresenter.LLJJJJJIL.invoke(c21356918hz.LIZJ());
                                c21355818ho.onSuccess();
                                backgroundVideoStickerPresenter.LLJJJIL.LJI(backgroundVideoStickerPresenter.LLLIIIIL, "toolbar", false);
                                backgroundVideoStickerPresenter.LJJIJL(c21356918hz.LJIIJJI, c21356918hz.LJIIL, c21356918hz.LJIILIIL, c21356918hz.LIZIZ);
                            }
                            if (C522610KeZ.LIZ()) {
                                backgroundVideoStickerPresenter.LLLIL = c21356918hz;
                            }
                        }
                    }
                }, new AwS611S0100000_32(this, 176), C0N6I.VIDEO, (ComposeView) view.findViewById(R.id.kfk), this.LLILLL, AFwS223S0000000_32.get$arr$(107), this.LLIZLLLIL, this.LLJJJIL, 4086);
            }
        }
        if (this.LLJJIJI && (effect = this.LLLIIIIL) != null && LJJIIJ(effect) && this.LLLIIIIL != null && !this.LLLFF) {
            LJJIIZI();
        }
        if (this.LLLFFI) {
            this.LLLFFI = false;
            LJIIJ();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        this.LLLIIIL = false;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return LJJIIJ(c1627370sRz.LIZ);
    }

    public final boolean LJJIIJ(Effect effect) {
        C21357318i3 c21357318i3;
        if (effect != null && (c21357318i3 = this.LLLF) != null) {
            c21357318i3.LJJIJIL = effect;
            C1630230sWb.LIZLLL = !C1449600npG.LJFF(effect);
            C1630230sWb.LIZJ = C1624200sMs.LIZLLL(effect);
        }
        if (C1624570sNT.LJIIJ(effect) || C21363018iy.LJI(effect) || C1624200sMs.LIZ(effect, "photo_picker") || C1624200sMs.LIZ(effect, "live_photo_picker") || (effect != null && C1449600npG.LJIIIIZZ(effect))) {
            return true;
        }
        return false;
    }

    public final void LJJIJIIJI(boolean z) {
        String str;
        int i;
        if (this.LLLILZJ == 0) {
            str = "video";
        } else {
            str = "album";
        }
        if (z) {
            Effect effect = this.LLLIIIIL;
            if (effect != null) {
                if (C522610KeZ.LIZ()) {
                    C21356918hz c21356918hz = this.LLLIL;
                    if (c21356918hz != null) {
                        i = c21356918hz.LJIIJ;
                    } else {
                        i = -1;
                    }
                    this.LLIZLLLIL.LIZLLL(effect, FaceStickerBean.sCurPropSource, str, String.valueOf(1), i);
                    return;
                }
                this.LLIZLLLIL.LIZLLL(effect, FaceStickerBean.sCurPropSource, str, String.valueOf(1), -1);
                return;
            }
            return;
        }
        Effect effect2 = this.LLLIIIIL;
        if (effect2 != null) {
            this.LLIZLLLIL.LIZIZ(effect2, FaceStickerBean.sCurPropSource, str);
        }
        this.LLLILZJ = 0;
    }

    public final void LJJIJLIJ(boolean z) {
        if (C21363018iy.LJI(this.LLLIIIIL)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJJIJIIJIL), C0PEM.LIZJ, null, new C21363118iz(z, this, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // X.AbstractC1622390sJx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.C1623370sLX r8, X.C1627370sRz r9) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter.LJJIII(X.0sLX, X.0sRz):void");
    }

    public final void LJJIJIL(String str, String str2) {
        this.LLJL = 4;
        if (str != null) {
            this.LLJLILLLLZIIL = str;
        }
        if (str2 != null) {
            this.LLJLIL = str2;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJJIJIIJIL), C0PEM.LIZJ, null, new C21363218j0(str, this, str2, null), 2);
    }

    public final void LJJIJL(int i, int i2, String str, String str2) {
        this.LLJL = 1;
        if (str != null) {
            this.LLJLILLLLZIIL = str;
        }
        if (str2 != null) {
            this.LLJLIL = str2;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJJIJIIJIL), C0PEM.LIZJ, null, new C21363318j1(str2, str, this, i, i2, null), 2);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 17) {
            if (i2 == 3 || i3 == 3) {
                if (this.LLJZIJLIL || this.LLLFZ) {
                    if (this.LLJJIJIIJIL.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
                        this.LLILZLL.get().LJIIJ(0L, C21363018iy.LIZLLL("FOREGROUND"));
                    }
                    this.LLJZIJLIL = false;
                    LJJIJLIJ(true);
                    if (this.LLLFZ) {
                        this.LLLFZ = false;
                        this.LLILZLL.get().LJIIJ(2L, (String) C21363018iy.LIZ.getValue());
                    }
                }
            }
        }
    }

    public final void LJJIJIIJIL(int i, int i2, Intent intent, String str, Function1<? super Intent, C21364318jB> function1) {
        String str2;
        C21357318i3 c21357318i3;
        if (i == 10002) {
            InterfaceC21362218iq interfaceC21362218iq = this.LLJILJIL;
            if (interfaceC21362218iq != null) {
                interfaceC21362218iq.LIZ();
            }
            if (i2 == -1) {
                if (intent != null) {
                    C21364318jB c21364318jBInvoke = function1.invoke(intent);
                    MediaModel mediaModel = c21364318jBInvoke.LIZ;
                    C21364418jC c21364418jC = c21364318jBInvoke.LIZIZ;
                    String str3 = c21364418jC.LIZ;
                    String str4 = c21364418jC.LIZIZ;
                    String str5 = c21364418jC.LIZJ;
                    AIGCInfo aIGCInfo = c21364418jC.LIZLLL;
                    if (mediaModel != null) {
                        this.LLJJJIL.LJI(this.LLLIIIIL, str, mediaModel.LJIIJJI());
                        if (mediaModel.LJIIJJI()) {
                            LJJIJIL(mediaModel.fileName, mediaModel.LJFF());
                        } else {
                            LJJIJL(mediaModel.width, mediaModel.height, mediaModel.fileName, mediaModel.LJFF());
                        }
                        this.LLILZLL.get().LIZIZ(aIGCInfo);
                    } else {
                        this.LLJLILLLLZIIL = this.LLJLL;
                        if (str5 != null) {
                            this.LLJL = 2;
                            this.LLJLIL = str5;
                            if (ChangeImagePickerUIExperiment.isEnabled()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new C1621190sI1(2, str5, "", "", "media_tray"));
                                C21357918i9.LIZJ(arrayList);
                                if (!C1624570sNT.LJIIL(this.LLLIIIIL) && (c21357318i3 = this.LLLF) != null) {
                                    c21357318i3.LJIILL();
                                }
                            }
                            this.LLILZLL.get().LIZIZ(aIGCInfo);
                        }
                        if (str3 != null && (!a0.LJJJIL(str3))) {
                            str2 = str3;
                        } else if (str5 != null && (!a0.LJJJIL(str5))) {
                            str2 = str5;
                        }
                        if (str4 != null && (!a0.LJJJIL(str4))) {
                            this.LLILZLL.get().LJII(str2, str4, aIGCInfo);
                        }
                        this.LLJJJIL.LJII(this.LLLIIIIL, str2, str);
                        this.LLIZ.LIZIZ();
                        this.LLL = true;
                        Effect effect = this.LLLIIIIL;
                        if (effect != null && C1449600npG.LJIIIIZZ(effect)) {
                            if (str3 == null || !(!a0.LJJJIL(str3))) {
                                str3 = null;
                            }
                            if (str5 != null && (!a0.LJJJIL(str5))) {
                                this.LLJJJJLIIL.invoke(new C0MZV(str5, str3, str4, aIGCInfo));
                            } else if (str3 != null) {
                                str5 = str3;
                                this.LLJJJJLIIL.invoke(new C0MZV(str5, str3, str4, aIGCInfo));
                            }
                        }
                    }
                }
            } else {
                this.LLL = false;
                this.LLJLL = "";
            }
            this.LLILZLL.get().LIZ();
            if (this.LLJJIJIL.invoke().booleanValue()) {
                this.LLILZLL.get().LJIIIIZZ();
            }
            if (((ArrayList) this.LLLIIL).contains(this.LLJLIL)) {
                C21357318i3 c21357318i32 = this.LLLF;
                if (c21357318i32 != null) {
                    c21357318i32.LJII(this.LLJLIL, this.LLLLIIIILLL);
                }
                if (C21363018iy.LJI(this.LLLIIIIL)) {
                    this.LLJZIJLIL = true;
                }
            } else {
                C21357318i3 c21357318i33 = this.LLLF;
                if (c21357318i33 != null) {
                    c21357318i33.LJIJJ();
                }
            }
            LJJIJIIJI(false);
        }
    }

    public BackgroundVideoStickerPresenter(C19EG c19eg, InterfaceC1624480sNK interfaceC1624480sNK, String str, InterfaceC524950KiL interfaceC524950KiL, C537130L4t c537130L4t, InterfaceC21361218ig interfaceC21361218ig, C0L1L c0l1l, C537120L4s c537120L4s, C537080L4o c537080L4o, C537070L4n c537070L4n, C1621630sIj c1621630sIj, C530260Kqu c530260Kqu, AFwS291S0000000_8 aFwS291S0000000_8, InterfaceC540220LGq interfaceC540220LGq, boolean z, LifecycleOwner lifecycleOwner, AwS552S0100000_8 awS552S0100000_8, AwS657S0100000_8 awS657S0100000_8, C21358618iG c21358618iG, C09I5 c09i5, AwS581S0100000_2 awS581S0100000_2, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, Function2 function2) {
        AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(598);
        this.LLILLJJLI = c19eg;
        this.LLILLL = interfaceC1624480sNK;
        this.LLILZ = str;
        this.LLILZIL = interfaceC524950KiL;
        this.LLILZLL = c537130L4t;
        this.LLIZ = interfaceC21361218ig;
        this.LLIZLLLIL = c0l1l;
        this.LLJ = c537120L4s;
        this.LLJI = c537080L4o;
        this.LLJIJIL = c537070L4n;
        this.LLJILJIL = c1621630sIj;
        this.LLJILJILJ = c530260Kqu;
        this.LLJILLL = aFwS291S0000000_8;
        this.LLJJ = interfaceC540220LGq;
        this.LLJJI = aFwS217S0000000_28;
        this.LLJJIII = false;
        this.LLJJIJI = z;
        this.LLJJIJIIJIL = lifecycleOwner;
        this.LLJJIJIL = awS552S0100000_8;
        this.LLJJJ = awS657S0100000_8;
        this.LLJJJIL = c21358618iG;
        this.LLJJJJ = c09i5;
        this.LLJJJJJIL = awS581S0100000_2;
        this.LLJJJJLIIL = function1;
        this.LLJJL = interfaceC1631620sYq;
        this.LLJJLIIIJLLLLLLLZ = function2;
        this.LLJL = 2;
        this.LLJLIL = "";
        this.LLJLILLLLZIIL = "";
        this.LLJLL = "";
        this.LLJLLIL = "";
        this.LLLIIL = new ArrayList();
        this.LLLIILIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(202));
        this.LLLILZ = new ArrayList();
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 601));
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLLIZZ = mutableLiveData;
        this.LLLJ = mutableLiveData;
        this.LLLJIL = new C21361718il();
        this.LLLJL = (InterfaceC21360318iX) c537120L4s.invoke(4);
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
