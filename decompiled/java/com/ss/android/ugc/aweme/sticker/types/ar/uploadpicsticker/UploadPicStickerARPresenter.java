package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import X.AbstractC21363818j6;
import X.C00B4;
import X.C01GW;
import X.C09HN;
import X.C0H7J;
import X.C0L1N;
import X.C0L1O;
import X.C0N6I;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1446130njf;
import X.C1446840nko;
import X.C1449260noi;
import X.C1449600npG;
import X.C15438062q;
import X.C1621130sHv;
import X.C1621190sI1;
import X.C1621280sIA;
import X.C1623370sLX;
import X.C1624230sMv;
import X.C1624550sNR;
import X.C1624570sNT;
import X.C1624610sNX;
import X.C1627370sRz;
import X.C1659630tI1;
import X.C1697810uHb;
import X.C19EG;
import X.C1AF0;
import X.C2095008Iq;
import X.C21356518hv;
import X.C21356918hz;
import X.C21357318i3;
import X.C21357418i4;
import X.C21357918i9;
import X.C21360518iZ;
import X.C21361618ik;
import X.C21361718il;
import X.C21362018io;
import X.C21366718jZ;
import X.C2188811AlT;
import X.C2286708xd;
import X.C385670FAf;
import X.C452501pT;
import X.C522610KeZ;
import X.C579040MnO;
import X.C580130Mp9;
import X.C786410Ut5;
import X.EnumC1155090gAF;
import X.EnumC1338240kve;
import X.EnumC19387410t6;
import X.InterfaceC1623110sL7;
import X.InterfaceC1624480sNK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1638300sjc;
import X.InterfaceC1670800ta2;
import X.InterfaceC1685430txd;
import X.InterfaceC212356188k;
import X.InterfaceC21358118iB;
import X.InterfaceC21360418iY;
import X.InterfaceC21360618ia;
import X.InterfaceC21361218ig;
import X.InterfaceC21361518ij;
import X.InterfaceC21361918in;
import X.InterfaceC21362118ip;
import X.InterfaceC21362218iq;
import X.InterfaceC21362718iv;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC537140L4u;
import X.InterfaceC540220LGq;
import Y.AObserverS234S0100000_32;
import Y.ARunnableS125S0100000_25;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.ugc.aweme.sticker.PlDataBean;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectTemplateEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qtk.c;

/* JADX INFO: loaded from: classes33.dex */
public final class UploadPicStickerARPresenter extends AbstractC21363818j6 implements InterfaceC1623110sL7, GenericLifecycleObserver {
    public static boolean LLLLZ;
    public final C19EG LLILLL;
    public final InterfaceC524950KiL LLILZ;
    public final InterfaceC21360418iY LLILZIL;
    public final InterfaceC21361218ig LLILZLL;
    public final InterfaceC537140L4u LLIZ;
    public final InterfaceC21361918in LLIZLLLIL;
    public final Function1<List<C1621190sI1>, Unit> LLJ;
    public final Function1<List<String>, Unit> LLJI;
    public final Function2<Long, String, Unit> LLJIJIL;
    public final boolean LLJILJIL;
    public final InterfaceC1631620sYq<Effect, Handler, DialogInterface.OnDismissListener, Dialog> LLJILJILJ;
    public final Function2<Effect, ViewGroup, InterfaceC21362118ip> LLJILLL;
    public final C385670FAf<Boolean> LLJJ;
    public final InterfaceC1631630sYr<Effect, List<C1621190sI1>, List<C1621190sI1>, Boolean, Unit> LLJJI;
    public final InterfaceC1685430txd<Effect, List<C1621190sI1>, List<C1621190sI1>, Boolean, Integer, String, Unit> LLJJIII;
    public final InterfaceC1631630sYr<Effect, String, String, Boolean, Unit> LLJJIJI;
    public final InterfaceC1631620sYq<Effect, String, C1621190sI1, Unit> LLJJIJIIJIL;
    public final InterfaceC21358118iB LLJJIJIL;
    public final LiveData<List<String>> LLJJJ;
    public final InterfaceC1624480sNK LLJJJIL;
    public final InterfaceC21362218iq LLJJJJ;
    public final Function0<Boolean> LLJJJJJIL;
    public final ArrayList<C1621190sI1> LLJJJJLIIL;
    public final boolean LLJJL;
    public final Function0<Boolean> LLJJLIIIJLLLLLLLZ;
    public final InterfaceC540220LGq LLJL;
    public final Function1<Effect, Boolean> LLJLIL;
    public final Function1<Effect, C1624230sMv> LLJLILLLLZIIL;
    public final Function0<Boolean> LLJLL;
    public final boolean LLJLLIL;
    public final Function0<String> LLJLLL;
    public final boolean LLJZ;
    public final boolean LLJZIJLIL;
    public final LifecycleOwner LLL;
    public final boolean LLLF;
    public final Function0<Boolean> LLLFF;
    public final Function0<Unit> LLLFFI;
    public final Function1<Effect, Boolean> LLLFZ;
    public final Function0<Unit> LLLI;
    public final LiveData<Effect> LLLII;
    public final boolean LLLIIII;
    public final ViewModelProvider LLLIIIIL;
    public C0L1N LLLIIIL;
    public C1621280sIA LLLIIL;
    public InterfaceC1638300sjc LLLIILIL;
    public Effect LLLIL;
    public C21356918hz LLLILZ;
    public InterfaceC21361518ij LLLILZJ;
    public Dialog LLLILZLLLI;
    public InterfaceC21362118ip LLLIZZ;
    public final ArrayList<String> LLLJ;
    public boolean LLLJIL;
    public String LLLJL;
    public long LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public C1624230sMv LLLLIIL;
    public final List<C1621190sI1> LLLLIILL;
    public int LLLLIILLL;
    public int LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public final List<C21356918hz> LLLLJI;
    public EnumC19387410t6 LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public String LLLLLJIL;
    public String LLLLLJLJLL;
    public boolean LLLLLL;
    public C21356918hz LLLLLLIL;
    public final MutableLiveData<Boolean> LLLLLLJ;
    public final MutableLiveData LLLLLLL;
    public final C01GW LLLLLLLLL;
    public final List<InterfaceC21362718iv> LLLLLLLLLL;
    public AwS433S0200000_32 LLLLLLLZIL;
    public final C21361718il LLLLLLZ;
    public FrameLayout LLLLLLZZ;
    public final C01GW LLLLLZ;
    public final LifecycleOwner LLLLLZIL;
    public final C01GW LLLLLZL;

    public UploadPicStickerARPresenter() {
        throw null;
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        this.LLLLII = false;
        InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
        if (interfaceC21361518ij != null) {
            interfaceC21361518ij.LJIIJ();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC21367218je
    public final void LJIIJJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.InterfaceC21367218je
    public final void LIZJ() {
        InterfaceC21358118iB interfaceC21358118iB = this.LLJJIJIL;
        if (interfaceC21358118iB != null) {
            interfaceC21358118iB.LJIILIIL();
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        InterfaceC21361518ij interfaceC21361518ij;
        List<InterfaceC21362718iv> list = this.LLLLLLLLLL;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC21362718iv) it2.next()).LIZ()) {
                    return;
                }
            }
        }
        if (!Intrinsics.LJFF(this.LLJJJIL.LLILIL(), this.LLLIL) || (interfaceC21361518ij = this.LLLILZJ) == null) {
            return;
        }
        this.LLLLII = true;
        interfaceC21361518ij.LJIJI(LLLLZ, this.LLLLIIL, null);
        if (C580130Mp9.LIZ(this.LLLJ)) {
            LJJIZ().LIZIZ();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLLJ);
        LJJJJLI(arrayList);
    }

    @Override // X.InterfaceC21367218je
    public final View LJIIL() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewSd = C786410Ut5.Sd(R.layout.ce6, this.LLILLL.getLayoutInflater(), null);
        SmartImageView smartImageView = (SmartImageView) viewSd.findViewById(R.id.k0w);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/ic_dynamic_greenscreen.png");
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        this.LLILLJJLI = viewSd;
        return viewSd;
    }

    @Override // X.InterfaceC21367218je
    public final View LJIJ() {
        InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
        if (interfaceC21361518ij != null) {
            return interfaceC21361518ij.getRootView();
        }
        return null;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
        if (interfaceC21361518ij != null && ChangeImagePickerUIExperiment.isEnabled()) {
            interfaceC21361518ij.LIZLLL();
        }
        this.LLLLLLZ.LIZIZ.cancel();
        this.LLLLLLLZIL = null;
        this.LLLLII = false;
        InterfaceC21361518ij interfaceC21361518ij2 = this.LLLILZJ;
        if (interfaceC21361518ij2 != null) {
            interfaceC21361518ij2.LJIIJ();
            interfaceC21361518ij2.LJI(null, true);
        }
        LJJIJIIJIL();
    }

    public final void LJJIIJ() {
        if (!this.LLLLJI.isEmpty()) {
            for (C21356918hz c21356918hz : (ArrayList) this.LLLLJI) {
                InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
                if (interfaceC21361518ij != null) {
                    interfaceC21361518ij.LJIL(c21356918hz);
                }
            }
            ((ArrayList) this.LLLLJI).clear();
        }
    }

    public final void LJJIJIL() {
        C21356918hz c21356918hz = this.LLLILZ;
        if (c21356918hz != null) {
            Integer numValueOf = Integer.valueOf(c21356918hz.LJI);
            if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    InterfaceC1631630sYr<Effect, String, String, Boolean, Unit> interfaceC1631630sYr = this.LLJJIJI;
                    Effect effect = this.LLLIL;
                    String strLIZ = c21356918hz.LIZ();
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    interfaceC1631630sYr.invoke(effect, strLIZ, "", Boolean.FALSE);
                } else if (numValueOf.intValue() == 3) {
                    InterfaceC1631620sYq<Effect, String, C1621190sI1, Unit> interfaceC1631620sYq = this.LLJJIJIIJIL;
                    Effect effect2 = this.LLLIL;
                    String strLIZ2 = c21356918hz.LIZ();
                    interfaceC1631620sYq.invoke(effect2, strLIZ2 != null ? strLIZ2 : "", new C1621190sI1(3, "", null, null, 0L, null, 56));
                }
            }
            this.LLLLLJLJLL = "default";
        }
        this.LLLLLLIL = null;
    }

    public final C21360518iZ LJJIZ() {
        return (C21360518iZ) this.LLLLLZ.getValue();
    }

    public final C21361618ik LJJJ() {
        return (C21361618ik) this.LLLLLLLLL.getValue();
    }

    public final void LJJJJJ() {
        String strInvoke = this.LLJLLL.invoke();
        InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
        if (interfaceC21361518ij == null || strInvoke.length() <= 0) {
            return;
        }
        interfaceC21361518ij.LJII(strInvoke, false);
    }

    public final void LJJJJJL() {
        C1624230sMv c1624230sMv = this.LLLLIIL;
        if (c1624230sMv == null || !c1624230sMv.LIZIZ) {
            InterfaceC1638300sjc interfaceC1638300sjc = this.LLLIILIL;
            if (interfaceC1638300sjc != null) {
                interfaceC1638300sjc.LIZ(this.LLLILZJ, false);
                return;
            }
            return;
        }
        InterfaceC1638300sjc interfaceC1638300sjc2 = this.LLLIILIL;
        if (interfaceC1638300sjc2 != null) {
            interfaceC1638300sjc2.LIZ(this.LLLILZJ, true);
        }
    }

    public final void LJJJJL() {
        String effectId;
        int i;
        InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
        if (interfaceC21361518ij != null) {
            this.LLLLII = true;
            C1624230sMv c1624230sMv = this.LLLLIIL;
            if (c1624230sMv != null) {
                Function0<Boolean> function0 = this.LLJJJJJIL;
                c1624230sMv.LJ = function0 != null ? function0.invoke() : null;
            }
            boolean z = LLLLZ;
            C1624230sMv c1624230sMv2 = this.LLLLIIL;
            Effect effect = this.LLLIL;
            interfaceC21361518ij.LJIJI(z, c1624230sMv2, effect != null ? effect.getEffectId() : null);
            C21361618ik c21361618ikLJJJ = LJJJ();
            c21361618ikLJJJ.LIZIZ();
            c21361618ikLJJJ.LIZ = "pic";
            Effect effect2 = this.LLLIL;
            if (effect2 == null || (effectId = effect2.getEffectId()) == null) {
                effectId = "";
            }
            c21361618ikLJJJ.LJIIIIZZ = effectId;
            c21361618ikLJJJ.LIZIZ = System.currentTimeMillis();
            InterfaceC21358118iB interfaceC21358118iB = this.LLJJIJIL;
            if (interfaceC21358118iB != null) {
                interfaceC21358118iB.LJIIIIZZ();
                i = 50;
            } else {
                i = -1;
            }
            c21361618ikLJJJ.LJFF = i;
            if (C580130Mp9.LIZ(this.LLLJ)) {
                LJJIZ().LIZIZ();
                LJJJ().LJII = false;
                return;
            }
            LJJJ().LJII = true;
            LJJJ().LIZJ = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LLLJ);
            LJJJJLI(arrayList);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
        if (interfaceC21361518ij != null) {
            interfaceC21361518ij.LJIJ();
        }
    }

    public final void LJJIJIIJIL() {
        InterfaceC1631630sYr<Effect, List<C1621190sI1>, List<C1621190sI1>, Boolean, Unit> interfaceC1631630sYr;
        String effectId;
        Long lLJIILIIL;
        C21360518iZ c21360518iZLJJIZ = LJJIZ();
        Effect effect = this.LLLIL;
        if (effect != null && (effectId = effect.getEffectId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(effectId)) != null) {
            lLJIILIIL.longValue();
        }
        c21360518iZLJJIZ.LIZ.LIZIZ();
        InterfaceC21360618ia interfaceC21360618ia = c21360518iZLJJIZ.LJIIIIZZ;
        if (interfaceC21360618ia != null) {
            interfaceC21360618ia.LIZ();
        }
        LJJIZ().LJIIJ = null;
        LJJIJIL();
        if ((!((ArrayList) this.LLLLIILL).isEmpty()) && (interfaceC1631630sYr = this.LLJJI) != null) {
            interfaceC1631630sYr.invoke(this.LLLIL, C13LP.LLIIII(this.LLLLIILL), C13BV.INSTANCE, Boolean.FALSE);
        }
        this.LLLJIL = false;
        this.LLLLJ = false;
        InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
        if (interfaceC21361518ij != null) {
            interfaceC21361518ij.LIZ();
            interfaceC21361518ij.clearData();
        }
        this.LLLILZ = null;
        this.LLLIL = null;
        InterfaceC21361918in interfaceC21361918in = this.LLIZLLLIL;
        if (interfaceC21361918in != null) {
            interfaceC21361918in.LIZ();
        }
        ((ArrayList) this.LLLLIILL).clear();
        this.LLLLLJLJLL = "default";
        InterfaceC21362118ip interfaceC21362118ip = this.LLLIZZ;
        if (interfaceC21362118ip != null) {
            interfaceC21362118ip.LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LJJIJIIJIL();
        this.LLLJ.clear();
        LJJIZ().LIZ();
        C1624610sNX.LIZ.getClass();
        C1624610sNX.LIZJ = true;
        InterfaceC524950KiL interfaceC524950KiL = this.LLILZ;
        if (interfaceC524950KiL == null) {
            InterfaceC1670800ta2 interfaceC1670800ta2 = this.LLILLL;
            if (!(interfaceC1670800ta2 instanceof InterfaceC524950KiL) || (interfaceC524950KiL = (InterfaceC524950KiL) interfaceC1670800ta2) == null) {
                return;
            }
        }
        interfaceC524950KiL.T4((InterfaceC484050IyZ) this.LLLLLZL.getValue());
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        return this.LLLLII;
    }

    public static C1621190sI1 LJJIL(C21356918hz c21356918hz) {
        String str;
        if (c21356918hz != null && (str = c21356918hz.LIZIZ) != null) {
            int i = c21356918hz.LJI;
            String str2 = "";
            if (i != 1) {
                if (i == 3) {
                    String str3 = c21356918hz.LIZ;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    String str4 = c21356918hz.LJII;
                    if (str4 == null) {
                        str4 = "GIPHY";
                    }
                    String str5 = c21356918hz.LJIIIIZZ;
                    if (str5 == null) {
                        str5 = "media_tray";
                    }
                    return new C1621190sI1(3, str, str2, str4, str5);
                }
                return null;
            }
            String str6 = c21356918hz.LIZ;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = c21356918hz.LJII;
            if (str7 != null) {
                str2 = str7;
            }
            String str8 = c21356918hz.LJIIIIZZ;
            if (str8 == null) {
                str8 = "unknown";
            }
            return new C1621190sI1(1, str, str6, str2, str8);
        }
        return null;
    }

    @Override // X.AbstractC21363818j6, X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLLLLLLLLL).add(c579040MnO);
    }

    @Override // X.AbstractC21363818j6, X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLLLLLLLLL).remove(c579040MnO);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        LLLLZ = true;
        if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE && this.LLLIL != null) {
            if (this.LLLLII) {
                LJJJJJ();
                InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
                if (interfaceC21361518ij != null) {
                    interfaceC21361518ij.LJIIJJI(this.LLLIL.getEffectId());
                }
            } else {
                LJJJJL();
            }
        }
        InterfaceC21361518ij interfaceC21361518ij2 = this.LLLILZJ;
        if (interfaceC21361518ij2 != null) {
            interfaceC21361518ij2.LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [X.18ie] */
    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        InterfaceC21361518ij c21357318i3;
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.wck);
        if (viewStubCompat != null) {
            viewStubCompat.setLayoutResource(R.layout.i66);
            View viewLIZ = viewStubCompat.LIZ();
            if (viewLIZ != null) {
                boolean z = false;
                if (this.LLJZIJLIL) {
                    this.LLJJJIL.LJIL();
                    boolean z2 = this.LLJJL;
                    if (z2) {
                        z = true;
                    }
                    C21356518hv c21356518hv = new C21356518hv(z, z2, this.LLJZIJLIL);
                    View viewFindViewById = view.findViewById(R.id.mf8);
                    View viewFindViewById2 = view.findViewById(R.id.zy6);
                    View viewFindViewById3 = viewLIZ.findViewById(R.id.i84);
                    View viewFindViewById4 = view.findViewById(R.id.i84);
                    View viewFindViewById5 = viewLIZ.findViewById(R.id.i85);
                    View viewFindViewById6 = view.findViewById(R.id.i85);
                    ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.i6k);
                    c21357318i3 = new C21357418i4(viewLIZ, viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6, (ViewGroup) view.findViewById(R.id.f760net), this.LLJJLIIIJLLLLLLLZ, this.LLJLL, this.LLILLL, this.LLJJIJIL, new InterfaceC212356188k() { // from class: X.18ie
                        @Override // X.InterfaceC212356188k
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LIZIZ() throws Throwable {
                            this.LIZ.getClass();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            EnumC19387410t6 enumC19387410t6 = EnumC19387410t6.GIPHY;
                            uploadPicStickerARPresenter.LLLLL = enumC19387410t6;
                            uploadPicStickerARPresenter.LJJJI(10004);
                            this.LIZ.LJJJJIZL(true);
                            this.LIZ.LLLLL = enumC19387410t6;
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJI() throws Throwable {
                            this.LIZ.getClass();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            EnumC19387410t6 enumC19387410t6 = EnumC19387410t6.ALBUM;
                            uploadPicStickerARPresenter.LLLLL = enumC19387410t6;
                            InterfaceC21358118iB interfaceC21358118iB = uploadPicStickerARPresenter.LLJJIJIL;
                            if (interfaceC21358118iB != null) {
                                interfaceC21358118iB.LIZIZ();
                            }
                            if (!ChangeImagePickerUIExperiment.isEnabled()) {
                                this.LIZ.LJJJJIZL(true);
                            }
                            this.LIZ.LJJJI(10001);
                            this.LIZ.LLLLL = enumC19387410t6;
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJIIL() {
                            this.LIZ.LJJIJIL();
                            if (C522610KeZ.LIZ()) {
                                this.LIZ.LLLLLLIL = null;
                            }
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJFF(List<C1621190sI1> list) {
                            this.LIZ.getClass();
                            this.LIZ.LJJIIZI(list, false);
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            uploadPicStickerARPresenter.LLLLL = EnumC19387410t6.PHOTO;
                            uploadPicStickerARPresenter.LLLLLIL = list.size();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
                            uploadPicStickerARPresenter2.LLLLLILLIL = 0;
                            uploadPicStickerARPresenter2.LJJJJIZL(false);
                            if (ChangeImagePickerUIExperiment.isEnabled()) {
                                ArrayList arrayListLIZ = C09HN.LIZ(list);
                                if (arrayListLIZ != null) {
                                    C21357918i9.LIZJ(arrayListLIZ);
                                }
                                InterfaceC21361518ij interfaceC21361518ij = this.LIZ.LLLILZJ;
                                if (interfaceC21361518ij != null) {
                                    interfaceC21361518ij.LJIILL();
                                    return;
                                }
                                return;
                            }
                            Function0<Unit> function0 = this.LIZ.LLLI;
                            if (function0 == null) {
                                return;
                            }
                            function0.invoke();
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LIZJ(C21356918hz c21356918hz, C21355818ho c21355818ho) {
                            C21356918hz c21356918hz2;
                            String str;
                            c21355818ho.onSuccess();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            String str2 = null;
                            if (c21356918hz != null) {
                                c21356918hz.LJIIIIZZ = "media_tray";
                                Effect effect = uploadPicStickerARPresenter.LLLIL;
                                if (effect != null) {
                                    uploadPicStickerARPresenter.LJJIJL(effect, c21356918hz, null);
                                }
                                c21356918hz2 = c21356918hz;
                            } else {
                                c21356918hz2 = null;
                            }
                            uploadPicStickerARPresenter.LLLILZ = c21356918hz2;
                            this.LIZ.getClass();
                            C1621190sI1 c1621190sI1LJJIL = UploadPicStickerARPresenter.LJJIL(c21356918hz);
                            if (C522610KeZ.LIZ()) {
                                this.LIZ.LLLLLLIL = c21356918hz;
                            }
                            if (c21356918hz != null && c21356918hz.LJI == 3) {
                                this.LIZ.LJJIIJZLJL(c1621190sI1LJJIL);
                                InterfaceC21358118iB interfaceC21358118iB = this.LIZ.LLJJIJIL;
                                if (interfaceC21358118iB != null) {
                                    if (c21356918hz != null) {
                                        str = c21356918hz.LIZ;
                                        str2 = c21356918hz.LIZLLL;
                                    } else {
                                        str = null;
                                    }
                                    interfaceC21358118iB.LJII(new C0L1M(str, str2));
                                }
                                UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
                                uploadPicStickerARPresenter2.LLLLL = EnumC19387410t6.GIPHY_REUSE;
                                uploadPicStickerARPresenter2.LLLLLIL = 0;
                                uploadPicStickerARPresenter2.LLLLLILLIL = 1;
                            } else {
                                this.LIZ.LJJIIZ(c1621190sI1LJJIL);
                                UploadPicStickerARPresenter uploadPicStickerARPresenter3 = this.LIZ;
                                uploadPicStickerARPresenter3.LLLLL = EnumC19387410t6.PHOTO;
                                uploadPicStickerARPresenter3.LLLLLIL = 1;
                                uploadPicStickerARPresenter3.LLLLLILLIL = 0;
                            }
                            this.LIZ.getClass();
                            this.LIZ.LJJJJIZL(true);
                            this.LIZ.LJJJJIZL(false);
                            Effect effect2 = this.LIZ.LLLIL;
                            if (effect2 != null && C1449600npG.LJFF(effect2)) {
                                LJIIL();
                            }
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJ(List<C1621190sI1> list, Map<C21356918hz, Integer> map) {
                            EffectSdkExtra effectSdkExtra;
                            PlDataBean pl;
                            if (C522610KeZ.LIZ()) {
                                if (map.isEmpty()) {
                                    this.LIZ.LLLLLLIL = null;
                                } else {
                                    this.LIZ.LLLLLLIL = (C21356918hz) C13LP.LJJLIIIJILLIZJL(map.keySet());
                                }
                            }
                            InterfaceC21361518ij interfaceC21361518ij = this.LIZ.LLLILZJ;
                            int i = 0;
                            if (interfaceC21361518ij != null && interfaceC21361518ij.LJIJJLI()) {
                                this.LIZ.LJJIJ(list, false);
                                C21356918hz c21356918hz = this.LIZ.LLLILZ;
                                if (c21356918hz != null && (effectSdkExtra = c21356918hz.LJ) != null && (pl = effectSdkExtra.getPl()) != null && pl.getMaxCount() == list.size()) {
                                    this.LIZ.LLILZLL.LIZIZ();
                                    return;
                                }
                                return;
                            }
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            if (uploadPicStickerARPresenter.LLILZLL.LIZ(uploadPicStickerARPresenter.LLLIL)) {
                                if (!list.isEmpty()) {
                                    UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
                                    C21356918hz c21356918hz2 = uploadPicStickerARPresenter2.LLLILZ;
                                    if (c21356918hz2 != null) {
                                        for (C1621190sI1 c1621190sI1 : list) {
                                            int i2 = i + 1;
                                            if (i >= 0) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(c21356918hz2.LIZ());
                                                sbLIZ.append(i2);
                                                c1621190sI1.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                                                i = i2;
                                            } else {
                                                C1697810uHb.LJIJI();
                                                throw null;
                                            }
                                        }
                                        InterfaceC1631630sYr<Effect, String, String, Boolean, Unit> interfaceC1631630sYr = uploadPicStickerARPresenter2.LLJJIJI;
                                        if (interfaceC1631630sYr != null) {
                                            interfaceC1631630sYr.invoke(uploadPicStickerARPresenter2.LLLIL, ((C1621190sI1) ListProtector.get(list, list.size() - 1)).LJFF, ((C1621190sI1) ListProtector.get(list, list.size() - 1)).LIZ, Boolean.TRUE);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                this.LIZ.LJJIJIL();
                            }
                        }
                    }, new AwS604S0100000_25(this, 756), viewGroup, c21356518hv, this.LLLFZ, C0N6I.PHOTO, (ComposeView) view.findViewById(R.id.kfk), this.LLJJJIL, new AwS576S0100000_32(this, 736));
                } else {
                    View viewFindViewById7 = view.findViewById(R.id.mf8);
                    View viewFindViewById8 = view.findViewById(R.id.zy6);
                    this.LLJJJIL.LJIL();
                    if (this.LLJJL) {
                        z = true;
                    }
                    c21357318i3 = new C21357318i3(viewLIZ, viewFindViewById7, viewFindViewById8, z, viewLIZ.findViewById(R.id.i84), view.findViewById(R.id.i84), viewLIZ.findViewById(R.id.i85), view.findViewById(R.id.i85), (ViewGroup) view.findViewById(R.id.f760net), this.LLJJLIIIJLLLLLLLZ, this.LLJLL, this.LLILLL, this.LLJJIJIL, new InterfaceC212356188k() { // from class: X.18if
                        @Override // X.InterfaceC212356188k
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LIZIZ() throws Throwable {
                            this.LIZ.getClass();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            EnumC19387410t6 enumC19387410t6 = EnumC19387410t6.GIPHY;
                            uploadPicStickerARPresenter.LLLLL = enumC19387410t6;
                            uploadPicStickerARPresenter.LJJJI(10004);
                            this.LIZ.LJJJJIZL(true);
                            this.LIZ.LLLLL = enumC19387410t6;
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJI() throws Throwable {
                            this.LIZ.getClass();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            EnumC19387410t6 enumC19387410t6 = EnumC19387410t6.ALBUM;
                            uploadPicStickerARPresenter.LLLLL = enumC19387410t6;
                            InterfaceC21358118iB interfaceC21358118iB = uploadPicStickerARPresenter.LLJJIJIL;
                            if (interfaceC21358118iB != null) {
                                interfaceC21358118iB.LIZIZ();
                            }
                            this.LIZ.LJJJJIZL(true);
                            this.LIZ.LJJJI(10001);
                            this.LIZ.LLLLL = enumC19387410t6;
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJIIL() {
                            this.LIZ.LJJIJIL();
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJFF(List<C1621190sI1> list) {
                            this.LIZ.getClass();
                            this.LIZ.LJJIIZI(list, false);
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            uploadPicStickerARPresenter.LLLLL = EnumC19387410t6.PHOTO;
                            uploadPicStickerARPresenter.LLLLLIL = list.size();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
                            uploadPicStickerARPresenter2.LLLLLILLIL = 0;
                            uploadPicStickerARPresenter2.LJJJJIZL(false);
                            Function0<Unit> function0 = this.LIZ.LLLI;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LIZJ(C21356918hz c21356918hz, C21355818ho c21355818ho) {
                            C21356918hz c21356918hz2;
                            String str;
                            c21355818ho.onSuccess();
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            String str2 = null;
                            if (c21356918hz != null) {
                                c21356918hz.LJIIIIZZ = "media_tray";
                                Effect effect = uploadPicStickerARPresenter.LLLIL;
                                if (effect != null) {
                                    uploadPicStickerARPresenter.LJJIJL(effect, c21356918hz, null);
                                }
                                c21356918hz2 = c21356918hz;
                            } else {
                                c21356918hz2 = null;
                            }
                            uploadPicStickerARPresenter.LLLILZ = c21356918hz2;
                            this.LIZ.getClass();
                            C1621190sI1 c1621190sI1LJJIL = UploadPicStickerARPresenter.LJJIL(c21356918hz);
                            if (C522610KeZ.LIZ()) {
                                this.LIZ.LLLLLLIL = c21356918hz;
                            }
                            if (c21356918hz != null && c21356918hz.LJI == 3) {
                                this.LIZ.LJJIIJZLJL(c1621190sI1LJJIL);
                                InterfaceC21358118iB interfaceC21358118iB = this.LIZ.LLJJIJIL;
                                if (interfaceC21358118iB != null) {
                                    if (c21356918hz != null) {
                                        str = c21356918hz.LIZ;
                                        str2 = c21356918hz.LIZLLL;
                                    } else {
                                        str = null;
                                    }
                                    interfaceC21358118iB.LJII(new C0L1M(str, str2));
                                }
                                UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
                                uploadPicStickerARPresenter2.LLLLL = EnumC19387410t6.GIPHY_REUSE;
                                uploadPicStickerARPresenter2.LLLLLIL = 0;
                                uploadPicStickerARPresenter2.LLLLLILLIL = 1;
                            } else {
                                this.LIZ.LJJIIZ(c1621190sI1LJJIL);
                                UploadPicStickerARPresenter uploadPicStickerARPresenter3 = this.LIZ;
                                uploadPicStickerARPresenter3.LLLLL = EnumC19387410t6.PHOTO;
                                uploadPicStickerARPresenter3.LLLLLIL = 1;
                                uploadPicStickerARPresenter3.LLLLLILLIL = 0;
                            }
                            this.LIZ.getClass();
                            this.LIZ.LJJJJIZL(true);
                            this.LIZ.LJJJJIZL(false);
                        }

                        @Override // X.InterfaceC212356188k
                        public final void LJ(List<C1621190sI1> list, Map<C21356918hz, Integer> map) {
                            if (C522610KeZ.LIZ()) {
                                if (map.isEmpty()) {
                                    this.LIZ.LLLLLLIL = null;
                                } else {
                                    this.LIZ.LLLLLLIL = (C21356918hz) C13LP.LJJJJZ(map.keySet());
                                }
                            }
                            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
                            if (uploadPicStickerARPresenter.LLILZLL.LIZ(uploadPicStickerARPresenter.LLLIL)) {
                                if (!list.isEmpty()) {
                                    UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
                                    C21356918hz c21356918hz = uploadPicStickerARPresenter2.LLLILZ;
                                    if (c21356918hz != null) {
                                        int i = 0;
                                        for (C1621190sI1 c1621190sI1 : list) {
                                            int i2 = i + 1;
                                            if (i >= 0) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(c21356918hz.LIZ());
                                                sbLIZ.append(i2);
                                                c1621190sI1.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                                                i = i2;
                                            } else {
                                                C1697810uHb.LJIJI();
                                                throw null;
                                            }
                                        }
                                        InterfaceC1631630sYr<Effect, String, String, Boolean, Unit> interfaceC1631630sYr = uploadPicStickerARPresenter2.LLJJIJI;
                                        if (interfaceC1631630sYr != null) {
                                            interfaceC1631630sYr.invoke(uploadPicStickerARPresenter2.LLLIL, ((C1621190sI1) ListProtector.get(list, list.size() - 1)).LJFF, ((C1621190sI1) ListProtector.get(list, list.size() - 1)).LIZ, Boolean.TRUE);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                this.LIZ.LJJIJIL();
                            }
                        }
                    }, new AwS604S0100000_25(this, 757), C0N6I.PHOTO, (ComposeView) view.findViewById(R.id.kfk), this.LLJJJIL, new AwS576S0100000_32(this, 737), null, null, 3145744);
                }
                this.LLLILZJ = c21357318i3;
                LJJJJJL();
            }
        }
        Effect effect = this.LLLIL;
        if (effect != null) {
            LJJJIL(effect);
        }
        this.LLLLLLZZ = (FrameLayout) view.findViewById(R.id.rpx);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        LLLLZ = false;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return LJJIJIIJI(c1627370sRz.LIZ);
    }

    public final void LJJIIJZLJL(C1621190sI1 c1621190sI1) {
        String strLIZ;
        String str = null;
        if (c1621190sI1 != null) {
            str = c1621190sI1.LIZ;
        }
        if (C2286708xd.LIZJ(str) && this.LLLILZ != null) {
            this.LLILZLL.LIZIZ();
            InterfaceC1631620sYq<Effect, String, C1621190sI1, Unit> interfaceC1631620sYq = this.LLJJIJIIJIL;
            Effect effect = this.LLLIL;
            C21356918hz c21356918hz = this.LLLILZ;
            if (c21356918hz == null || (strLIZ = c21356918hz.LIZ()) == null) {
                strLIZ = "";
            }
            interfaceC1631620sYq.invoke(effect, strLIZ, c1621190sI1);
            InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
            if (interfaceC21361518ij != null) {
                interfaceC21361518ij.LJ();
                C1621280sIA c1621280sIA = this.LLLIIL;
                if (c1621280sIA != null) {
                    c1621280sIA.LIZ.LLLLLLLZIL = 0;
                }
            }
            this.LLLLLJLJLL = "gif_mode";
            this.LLLLIIIILLL = false;
        }
    }

    public final void LJJIIZ(C1621190sI1 c1621190sI1) {
        String strLIZ;
        if (c1621190sI1 == null) {
            return;
        }
        String str = c1621190sI1.LIZ;
        if (C2286708xd.LIZJ(str) && this.LLLILZ != null) {
            if (!C1624570sNT.LJIIIZ(this.LLLIL)) {
                this.LLILZLL.LIZIZ();
            }
            InterfaceC1631630sYr<Effect, String, String, Boolean, Unit> interfaceC1631630sYr = this.LLJJIJI;
            Effect effect = this.LLLIL;
            C21356918hz c21356918hz = this.LLLILZ;
            if (c21356918hz != null) {
                strLIZ = c21356918hz.LIZ();
            } else {
                strLIZ = null;
            }
            String str2 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            if (str != null) {
                str2 = str;
            }
            interfaceC1631630sYr.invoke(effect, strLIZ, str2, Boolean.FALSE);
            Function1<List<String>, Unit> function1 = this.LLJI;
            if (function1 != null) {
                function1.invoke(Collections.singletonList(str));
                this.LLLLJ = true;
            }
            ArrayList arrayList = (ArrayList) this.LLLLIILL;
            arrayList.clear();
            arrayList.add(c1621190sI1);
            this.LLLLLJLJLL = "single_image";
            this.LLLLIIIILLL = true;
            Function1<List<C1621190sI1>, Unit> function12 = this.LLJ;
            if (function12 != null) {
                function12.invoke(this.LLLLIILL);
            }
        }
    }

    public final boolean LJJIJIIJI(Effect effect) {
        boolean z;
        C1624230sMv c1624230sMvLIZ;
        if (C1449600npG.LJIIIIZZ(effect) || C1624550sNR.LIZLLL(effect) || C1624570sNT.LJIIZILJ(effect)) {
            return false;
        }
        if (this.LLJLIL.invoke(effect).booleanValue()) {
            c1624230sMvLIZ = this.LLJLILLLLZIIL.invoke(effect);
        } else {
            C1624610sNX c1624610sNX = C1624610sNX.LIZ;
            if (this.LLJJI != null) {
                z = true;
            } else {
                z = false;
            }
            c1624610sNX.getClass();
            c1624230sMvLIZ = C1624610sNX.LIZ(effect, z);
        }
        this.LLLLIIL = c1624230sMvLIZ;
        if (c1624230sMvLIZ == null) {
            return false;
        }
        return c1624230sMvLIZ.LIZ;
    }

    public final C21356918hz LJJIJLIJ(C1621190sI1 c1621190sI1) {
        Integer numValueOf;
        C21356918hz c21356918hz;
        String effectId;
        String effectId2;
        if (c1621190sI1 != null) {
            numValueOf = Integer.valueOf(c1621190sI1.LIZIZ);
        } else {
            numValueOf = null;
        }
        String str = "";
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                c21356918hz = new C21356918hz(c1621190sI1.LIZ);
                c21356918hz.LJI = 1;
                c21356918hz.LJII = c1621190sI1.LIZLLL;
                c21356918hz.LJIIIIZZ = c1621190sI1.LJ;
                c21356918hz.LIZ = c1621190sI1.LIZJ;
                Effect effect = this.LLLIL;
                if (effect != null && (effectId2 = effect.getEffectId()) != null) {
                    str = effectId2;
                }
                c21356918hz.LIZLLL = str;
                Effect effect2 = this.LLLIL;
                if (effect2 != null) {
                    LJJIJL(effect2, c21356918hz, null);
                }
            } else if (numValueOf.intValue() == 3) {
                c21356918hz = new C21356918hz(c1621190sI1.LIZ);
                c21356918hz.LJI = 3;
                c21356918hz.LJII = c1621190sI1.LIZLLL;
                c21356918hz.LJIIIIZZ = c1621190sI1.LJ;
                c21356918hz.LIZ = c1621190sI1.LIZJ;
                Effect effect3 = this.LLLIL;
                if (effect3 != null && (effectId = effect3.getEffectId()) != null) {
                    str = effectId;
                }
                c21356918hz.LIZLLL = str;
                Effect effect4 = this.LLLIL;
                if (effect4 != null) {
                    LJJIJL(effect4, c21356918hz, null);
                    return c21356918hz;
                }
            }
            return c21356918hz;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0 A[Catch: NullPointerException -> 0x01d8, PHI: r1
      0x01a0: PHI (r1v5 X.0KiL) = (r1v4 X.0KiL), (r1v9 X.0KiL) binds: [B:76:0x0194, B:80:0x019e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {NullPointerException -> 0x01d8, blocks: (B:75:0x0188, B:77:0x0196, B:79:0x019c, B:82:0x01b6, B:84:0x01d4, B:81:0x01a0), top: B:89:0x0188 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(int r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter.LJJJI(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJIL(com.ss.android.ugc.effectmanager.effect.model.Effect r7) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter.LJJJIL(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    public final boolean LJJJJI(Effect effect) {
        Effect effect2;
        if (effect != null && (effect2 = this.LLLIL) != null) {
            return Intrinsics.LJFF(effect2.getEffectId(), effect.getEffectId());
        }
        return false;
    }

    public final void LJJJJIZL(boolean z) {
        int source;
        C21356918hz c21356918hz;
        String str;
        C21356918hz c21356918hz2;
        boolean z2 = true;
        int i = 0;
        if (z) {
            int i2 = -1;
            if (ChangeImagePickerUIExperiment.isEnabled()) {
                C1624230sMv c1624230sMv = this.LLLLIIL;
                if (c1624230sMv == null || !c1624230sMv.LIZIZ) {
                    z2 = false;
                }
                if (C522610KeZ.LIZ() && (c21356918hz2 = this.LLLLLLIL) != null) {
                    i2 = c21356918hz2.LJIIJ;
                }
                Effect effect = this.LLLIL;
                if (effect != null) {
                    String lowerCase = this.LLLLL.name().toLowerCase(Locale.getDefault());
                    String str2 = this.LLLLLJIL;
                    String strValueOf = String.valueOf(((ArrayList) this.LLLLIILL).size());
                    if (z2) {
                        str = "multi_photo";
                    } else {
                        str = "photo";
                    }
                    C0L1O c0l1o = new C0L1O(effect, lowerCase, str2, strValueOf, CardStruct.IStatusCode.DEFAULT, str, i2);
                    C0L1N c0l1n = this.LLLIIIL;
                    if (c0l1n != null) {
                        c0l1n.LIZ(c0l1o);
                    }
                }
            } else {
                if (C522610KeZ.LIZ() && (c21356918hz = this.LLLLLLIL) != null) {
                    i2 = c21356918hz.LJIIJ;
                }
                Effect effect2 = this.LLLIL;
                if (effect2 != null) {
                    String str3 = null;
                    C0L1O c0l1o2 = new C0L1O(effect2, this.LLLLL.name().toLowerCase(Locale.getDefault()), this.LLLLLJIL, str3, str3, i2, 112);
                    C0L1N c0l1n2 = this.LLLIIIL;
                    if (c0l1n2 != null) {
                        c0l1n2.LIZ(c0l1o2);
                    }
                }
            }
        } else {
            Effect effect3 = this.LLLIL;
            if (effect3 != null) {
                C0L1O c0l1o3 = new C0L1O(effect3, this.LLLLL.name().toLowerCase(Locale.getDefault()), this.LLLLLJIL, String.valueOf(this.LLLLLIL), String.valueOf(this.LLLLLILLIL), i, 192);
                C0L1N c0l1n3 = this.LLLIIIL;
                if (c0l1n3 != null) {
                    DiyPropParser.LJIIJJI(c0l1o3.LIZ);
                    DiyPropParser.LJIIJJI(c0l1o3.LIZ);
                    ShortVideoContext shortVideoContext = c0l1n3.LIZ;
                    Pair[] pairArr = new Pair[10];
                    pairArr[0] = new Pair("picture_source", "upload");
                    pairArr[1] = new Pair("prop_id", c0l1o3.LIZ.getEffectId());
                    pairArr[2] = new Pair("click_content", c0l1o3.LIZIZ);
                    String str4 = c0l1o3.LIZJ;
                    if (str4 == null) {
                        str4 = "";
                    }
                    pairArr[3] = new Pair("video_source", str4);
                    String str5 = c0l1o3.LIZLLL;
                    if (str5 == null) {
                        str5 = "";
                    }
                    pairArr[4] = new Pair("pic_cnt", str5);
                    String str6 = c0l1o3.LJ;
                    if (str6 == null) {
                        str6 = "";
                    }
                    pairArr[5] = new Pair("video_cnt", str6);
                    pairArr[6] = new Pair("is_reuse_create_effect", CardStruct.IStatusCode.DEFAULT);
                    pairArr[7] = new Pair("reuse_effect_id", "");
                    Effect effect4 = c0l1o3.LIZ;
                    if (C1446840nko.LJ(effect4)) {
                        source = 102;
                    } else if (effect4 instanceof MobileEffectTemplateEffect) {
                        source = 101;
                    } else {
                        source = effect4.getSource();
                    }
                    pairArr[8] = new Pair("effect_source", String.valueOf(source));
                    pairArr[9] = new Pair("resource_id", c0l1o3.LIZ.getResourceId());
                    C1449260noi.LJ("prop_customized_complete", C1449260noi.LIZ(shortVideoContext, pairArr));
                    C1449260noi.LJ("mobile_effect_customized_click", C1449260noi.LIZ(c0l1n3.LIZ, new Pair("template_id", c0l1o3.LIZ.getEffectId()), new Pair("template_name", c0l1o3.LIZ.getName()), new Pair("is_reuse_create_effect", CardStruct.IStatusCode.DEFAULT), new Pair("reuse_effect_id", "")));
                }
            }
        }
        this.LLLLL = EnumC19387410t6.DEFAULT;
        this.LLLLLIL = 0;
        this.LLLLLILLIL = 0;
    }

    public final void LJJJJLI(List<String> list) {
        C21356918hz c21356918hz;
        int iLJIIIZ;
        InterfaceC21358118iB interfaceC21358118iB;
        int size;
        C1621190sI1 c1621190sI1;
        String strLIZ;
        String strLIZ2;
        String str;
        InterfaceC21361518ij interfaceC21361518ij;
        InterfaceC21361518ij interfaceC21361518ij2;
        if (!this.LLLJIL && !list.isEmpty() && (c21356918hz = this.LLLILZ) != null) {
            Integer numValueOf = null;
            UploadPicStickerManager$initHandler$1 uploadPicStickerManager$initHandler$1 = null;
            if (!c21356918hz.LJ.getPl().getAlg().isEmpty() && C13LQ.LJLIIL(new Integer[]{2, 3, 0}).contains(Integer.valueOf(c21356918hz.LJ.getPl().getAlbumFilter()))) {
                LJJJ().LJIIJ = true;
                InterfaceC21361518ij interfaceC21361518ij3 = this.LLLILZJ;
                if (interfaceC21361518ij3 != null) {
                    interfaceC21361518ij3.LJIILLIIL();
                }
                C21360518iZ c21360518iZLJJIZ = LJJIZ();
                c21360518iZLJJIZ.getClass();
                if (!list.isEmpty() && !c21356918hz.LJ.getPl().getAlg().isEmpty()) {
                    c21360518iZLJJIZ.LJIIJ = null;
                    UploadPicStickerManager$initHandler$2 uploadPicStickerManager$initHandler$2 = c21360518iZLJJIZ.LJII;
                    if (uploadPicStickerManager$initHandler$2 != null) {
                        uploadPicStickerManager$initHandler$2.removeCallbacksAndMessages(null);
                    }
                    UploadPicStickerManager$initHandler$1 uploadPicStickerManager$initHandler$12 = c21360518iZLJJIZ.LJFF;
                    if (uploadPicStickerManager$initHandler$12 == null) {
                        uploadPicStickerManager$initHandler$12 = null;
                    }
                    uploadPicStickerManager$initHandler$12.removeCallbacksAndMessages(null);
                    c21360518iZLJJIZ.LJIIJ = (String) C13LP.LJJLIIIJJI(list);
                    c21360518iZLJJIZ.LJIIIZ = c21356918hz.LIZLLL;
                    Message messageObtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJIL(bundle, "img_list", (ArrayList) list);
                    C786410Ut5.LJJIJL(bundle, "effect_sdk_extra", c21356918hz.LJ);
                    messageObtain.setData(bundle);
                    messageObtain.what = 1004;
                    UploadPicStickerManager$initHandler$1 uploadPicStickerManager$initHandler$13 = c21360518iZLJJIZ.LJFF;
                    if (uploadPicStickerManager$initHandler$13 != null) {
                        uploadPicStickerManager$initHandler$1 = uploadPicStickerManager$initHandler$13;
                    }
                    C786410Ut5.LJLJJL(uploadPicStickerManager$initHandler$1, messageObtain);
                    return;
                }
                InterfaceC21360618ia interfaceC21360618ia = c21360518iZLJJIZ.LJIIIIZZ;
                if (interfaceC21360618ia == null) {
                    return;
                }
                interfaceC21360618ia.LIZLLL();
                return;
            }
            if (this.LLJLLIL && (interfaceC21361518ij2 = this.LLLILZJ) != null) {
                interfaceC21361518ij2.clearData();
            }
            InterfaceC21361518ij interfaceC21361518ij4 = this.LLLILZJ;
            if (interfaceC21361518ij4 != null && interfaceC21361518ij4.LJIIIZ() == 0 && !C580130Mp9.LIZ(this.LLLJ)) {
                int size2 = this.LLLJ.size();
                ArrayList<C1621190sI1> arrayList = this.LLJJJJLIIL;
                if (arrayList != null) {
                    size = arrayList.size();
                } else {
                    size = 0;
                }
                ArrayList arrayList2 = new ArrayList(size2 + size);
                ArrayList<C1621190sI1> arrayList3 = this.LLJJJJLIIL;
                if (arrayList3 != null) {
                    for (C1621190sI1 c1621190sI12 : arrayList3) {
                        C21356918hz c21356918hz2 = new C21356918hz(c1621190sI12.LIZ);
                        c21356918hz2.LJI = 3;
                        c21356918hz2.LIZ = c1621190sI12.LIZJ;
                        c21356918hz2.LJII = c1621190sI12.LIZLLL;
                        arrayList2.add(c21356918hz2);
                    }
                }
                Iterator<String> it2 = this.LLLJ.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C21356918hz(it2.next()));
                }
                if (ChangeImagePickerUIExperiment.isEnabled() && (interfaceC21361518ij = this.LLLILZJ) != null) {
                    interfaceC21361518ij.LIZIZ();
                }
                InterfaceC21361518ij interfaceC21361518ij5 = this.LLLILZJ;
                if (interfaceC21361518ij5 != null) {
                    interfaceC21361518ij5.LJIILJJIL(arrayList2);
                }
                if (C580130Mp9.LIZIZ(this.LLJJJJLIIL)) {
                    this.LLLLLJIL = "giphy";
                    ArrayList<C1621190sI1> arrayList4 = this.LLJJJJLIIL;
                    if (arrayList4 != null) {
                        c1621190sI1 = (C1621190sI1) C13LP.LJJJJZI(arrayList4);
                    } else {
                        c1621190sI1 = null;
                    }
                    InterfaceC21361518ij interfaceC21361518ij6 = this.LLLILZJ;
                    if (interfaceC21361518ij6 != null) {
                        if (c1621190sI1 != null) {
                            str = c1621190sI1.LIZ;
                        } else {
                            str = null;
                        }
                        interfaceC21361518ij6.LJII(str, false);
                    }
                    this.LLLILZ = LJJIJLIJ(c1621190sI1);
                    if (c1621190sI1 != null) {
                        numValueOf = Integer.valueOf(c1621190sI1.LIZIZ);
                    }
                    String str2 = "";
                    if (numValueOf != null) {
                        if (numValueOf.intValue() == 1) {
                            InterfaceC1631630sYr<Effect, String, String, Boolean, Unit> interfaceC1631630sYr = this.LLJJIJI;
                            Effect effect = this.LLLIL;
                            C21356918hz c21356918hz3 = this.LLLILZ;
                            if (c21356918hz3 != null && (strLIZ2 = c21356918hz3.LIZ()) != null) {
                                str2 = strLIZ2;
                            }
                            interfaceC1631630sYr.invoke(effect, str2, c1621190sI1.LIZ, Boolean.FALSE);
                            this.LLLLLJLJLL = "single_image";
                        } else if (numValueOf.intValue() == 3) {
                            InterfaceC1631620sYq<Effect, String, C1621190sI1, Unit> interfaceC1631620sYq = this.LLJJIJIIJIL;
                            Effect effect2 = this.LLLIL;
                            C21356918hz c21356918hz4 = this.LLLILZ;
                            if (c21356918hz4 != null && (strLIZ = c21356918hz4.LIZ()) != null) {
                                str2 = strLIZ;
                            }
                            interfaceC1631620sYq.invoke(effect2, str2, c1621190sI1);
                            this.LLLLLJLJLL = "gif_mode";
                        }
                    }
                }
            }
            this.LLLJIL = true;
            InterfaceC21361518ij interfaceC21361518ij7 = this.LLLILZJ;
            if (interfaceC21361518ij7 != null) {
                interfaceC21361518ij7.LIZ();
            }
            LJJJJJ();
            C21361618ik c21361618ikLJJJ = LJJJ();
            c21361618ikLJJJ.LJIIJ = false;
            InterfaceC21361518ij interfaceC21361518ij8 = this.LLLILZJ;
            if (interfaceC21361518ij8 != null) {
                iLJIIIZ = interfaceC21361518ij8.LJIIIZ();
            } else {
                iLJIIIZ = -1;
            }
            c21361618ikLJJJ.LJI = iLJIIIZ;
            c21361618ikLJJJ.LIZLLL = System.currentTimeMillis();
            if (c21361618ikLJJJ.LIZJ() && (interfaceC21358118iB = this.LLJJIJIL) != null) {
                interfaceC21358118iB.LIZ(c21361618ikLJJJ.LIZ());
            }
            c21361618ikLJJJ.LIZIZ();
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        Function0<Boolean> function0;
        this.LLLLLLLZIL = new AwS433S0200000_32(c1627370sRz, this, 71);
        if (C1624570sNT.LJIJ(c1627370sRz.LIZ) || ((function0 = this.LLLFF) != null && function0.invoke().booleanValue())) {
            AwS433S0200000_32 awS433S0200000_32 = this.LLLLLLLZIL;
            if (awS433S0200000_32 != null) {
                awS433S0200000_32.invoke();
            }
        } else {
            this.LLLLLLZ.LIZ(this.LLJL, this.LLILLL, new AwS576S0100000_32(this, 339));
        }
        this.LLLLII = true;
    }

    public final void LJJIIZI(List<C1621190sI1> list, boolean z) {
        C21356918hz c21356918hz = this.LLLILZ;
        if (c21356918hz != null) {
            this.LLILZLL.LIZIZ();
            int i = 0;
            for (C1621190sI1 c1621190sI1 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c21356918hz.LIZ());
                    sbLIZ.append(i2);
                    c1621190sI1.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            InterfaceC1631630sYr<Effect, List<C1621190sI1>, List<C1621190sI1>, Boolean, Unit> interfaceC1631630sYr = this.LLJJI;
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(this.LLLIL, C13LP.LLIIII(this.LLLLIILL), list, Boolean.valueOf(z));
            }
            Function1<List<String>, Unit> function1 = this.LLJI;
            if (function1 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1621190sI1> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                function1.invoke(arrayList);
                this.LLLLJ = true;
            }
            ArrayList arrayList2 = (ArrayList) this.LLLLIILL;
            arrayList2.clear();
            arrayList2.addAll(list);
            this.LLLLLJLJLL = "multi_images";
            this.LLLLIIIILLL = true;
            Function1<List<C1621190sI1>, Unit> function12 = this.LLJ;
            if (function12 != null) {
                function12.invoke(this.LLLLIILL);
            }
        }
    }

    public final void LJJIJ(List<C1621190sI1> list, boolean z) {
        int i;
        C21356918hz c21356918hz = this.LLLILZ;
        if (c21356918hz != null) {
            int i2 = 0;
            for (C1621190sI1 c1621190sI1 : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c21356918hz.LIZ());
                    sbLIZ.append(i3);
                    c1621190sI1.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            InterfaceC1685430txd<Effect, List<C1621190sI1>, List<C1621190sI1>, Boolean, Integer, String, Unit> interfaceC1685430txd = this.LLJJIII;
            if (interfaceC1685430txd != null) {
                Effect effect = this.LLLIL;
                List<C1621190sI1> listLLIIII = C13LP.LLIIII(this.LLLLIILL);
                Boolean boolValueOf = Boolean.valueOf(z);
                C1624230sMv c1624230sMv = this.LLLLIIL;
                if (c1624230sMv != null) {
                    i = c1624230sMv.LIZLLL;
                } else {
                    i = 1;
                }
                Integer numValueOf = Integer.valueOf(i);
                String strLIZ = c21356918hz.LIZ();
                if (strLIZ == null) {
                    strLIZ = "";
                }
                interfaceC1685430txd.invoke(effect, listLLIIII, list, boolValueOf, numValueOf, strLIZ);
            }
            Function1<List<String>, Unit> function1 = this.LLJI;
            if (function1 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1621190sI1> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                function1.invoke(arrayList);
                this.LLLLJ = true;
            }
            ArrayList arrayList2 = (ArrayList) this.LLLLIILL;
            arrayList2.clear();
            arrayList2.addAll(list);
            this.LLLLLJLJLL = "multi_images";
            this.LLLLIIIILLL = true;
            Function1<List<C1621190sI1>, Unit> function12 = this.LLJ;
            if (function12 != null) {
                function12.invoke(this.LLLLIILL);
            }
        }
    }

    public final void LJJJJ(List<C1621190sI1> list, boolean z) {
        boolean z2;
        String str;
        this.LLLILZ = LJJIJLIJ((C1621190sI1) C13LP.LJJJJZI(list));
        C1624230sMv c1624230sMv = this.LLLLIIL;
        if (c1624230sMv != null && c1624230sMv.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1621190sI1 c1621190sI1 = (C1621190sI1) C13LP.LJJJLL(list);
        if (c1621190sI1 == null) {
            C1AF0.LIZJ("UploadPicStickerARPresenter: empty media sent returned: handleSelectedMediaList");
            return;
        }
        if (z2 && c1621190sI1.LIZIZ == 1) {
            boolean z3 = !z;
            InterfaceC21361518ij interfaceC21361518ij = this.LLLILZJ;
            if (interfaceC21361518ij != null && interfaceC21361518ij.LJIJJLI()) {
                LJJIJ(list, z3);
            } else {
                LJJIIZI(list, z3);
            }
            InterfaceC21361518ij interfaceC21361518ij2 = this.LLLILZJ;
            if (interfaceC21361518ij2 != null) {
                interfaceC21361518ij2.LJIIZILJ(list);
                if (ChangeImagePickerUIExperiment.isEnabled()) {
                    ArrayList arrayListLIZ = C09HN.LIZ(list);
                    if (arrayListLIZ != null) {
                        C21357918i9.LIZJ(arrayListLIZ);
                    }
                    InterfaceC21361518ij interfaceC21361518ij3 = this.LLLILZJ;
                    if (interfaceC21361518ij3 != null) {
                        interfaceC21361518ij3.LJIILL();
                    }
                }
            }
            this.LLLLLIL = list.size();
            this.LLLLLILLIL = 0;
            LJJJJIZL(false);
            return;
        }
        int i = c1621190sI1.LIZIZ;
        if (i == 1) {
            LJJIIZ(c1621190sI1);
            InterfaceC21361518ij interfaceC21361518ij4 = this.LLLILZJ;
            if (interfaceC21361518ij4 != null) {
                interfaceC21361518ij4.LJIJJ();
                interfaceC21361518ij4.LJII(c1621190sI1.LIZ, false);
                if (ChangeImagePickerUIExperiment.isEnabled()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c1621190sI1);
                    C21357918i9.LIZJ(arrayList);
                    InterfaceC21361518ij interfaceC21361518ij5 = this.LLLILZJ;
                    if (interfaceC21361518ij5 != null) {
                        interfaceC21361518ij5.LJIILL();
                    }
                }
            }
            this.LLLLLIL = 1;
            this.LLLLLILLIL = 0;
            LJJJJIZL(false);
            return;
        }
        if (i == 3) {
            LJJIIJZLJL(c1621190sI1);
            InterfaceC21361518ij interfaceC21361518ij6 = this.LLLILZJ;
            if (interfaceC21361518ij6 != null) {
                interfaceC21361518ij6.LJIJJ();
                interfaceC21361518ij6.LJII(c1621190sI1.LIZ, false);
            }
            InterfaceC21358118iB interfaceC21358118iB = this.LLJJIJIL;
            if (interfaceC21358118iB != null) {
                C21356918hz c21356918hz = this.LLLILZ;
                String str2 = null;
                if (c21356918hz != null) {
                    str = c21356918hz.LIZ;
                    str2 = c21356918hz.LIZLLL;
                } else {
                    str = null;
                }
                interfaceC21358118iB.LJIIJ(str, str2, "giphy_tab");
            }
            this.LLLLLIL = 0;
            this.LLLLLILLIL = 1;
            LJJJJIZL(false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadPicStickerARPresenter: unsupported media: isMulti = ");
        sbLIZ.append(z2);
        sbLIZ.append(" type: ");
        sbLIZ.append(c1621190sI1.LIZIZ);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIJL(Effect effect, C21356918hz c21356918hz, Bundle bundle) {
        String effectId;
        String string;
        if (!(!C580130Mp9.LIZ(c21356918hz.LJ.getPl().getAlg()))) {
            if (effect != null) {
                c21356918hz.LIZIZ(effect.getSdkExtra());
            }
            C1624610sNX c1624610sNX = C1624610sNX.LIZ;
            boolean guide = c21356918hz.LJ.getPl().getGuide();
            c1624610sNX.getClass();
            C1624610sNX.LIZLLL = guide;
            C1624610sNX.LIZJ = c21356918hz.LJ.getPl().getLoading();
        }
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        c21356918hz.LIZLLL = effectId;
        try {
            C1446130njf.LIZ.getClass();
            c21356918hz.LJIILL = C1446130njf.LJFF(effect, "effect_algorithm_hint");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle != null && (string = bundle.getString("green_screen_kit_image_path")) != null) {
            c21356918hz.LIZIZ = string;
            this.LLLLLL = true;
        }
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        boolean z;
        InterfaceC21361518ij interfaceC21361518ij;
        View rootView;
        if (this.LLLIIII && (!Intrinsics.LJFF(this.LLLIL, this.LLJJJIL.LLILIL()) || this.LLLIL == null)) {
            return;
        }
        C1624230sMv c1624230sMv = this.LLLLIIL;
        if (c1624230sMv != null && c1624230sMv.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if ((i == 31 || i == 30) && !z) {
            ((LiveData) ((UploadPicStickerMessageModule) this.LLLIIIIL.get(UploadPicStickerMessageModule.class)).LL.getValue()).postValue(new C21362018io(i, str));
        }
        if (this.LLJILJIL && i == 41) {
            C21362018io c21362018io = new C21362018io(i, str);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optString("interface").equals("media_picker")) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("body");
                String strOptString = jSONObjectOptJSONObject.optString("command");
                String strOptString2 = jSONObjectOptJSONObject.optString("style");
                if (strOptString.equals(C00B4.SHOW.getValue()) && strOptString2.equals(C0H7J.ALBUM.getValue()) && (interfaceC21361518ij = this.LLLILZJ) != null && (rootView = interfaceC21361518ij.getRootView()) != null) {
                    HandlerHook.viewPost(rootView, new ARunnableS125S0100000_25(this, 88));
                    ((LiveData) ((UploadPicStickerMessageModule) this.LLLIIIIL.get(UploadPicStickerMessageModule.class)).LL.getValue()).postValue(c21362018io);
                }
            }
        }
    }

    public UploadPicStickerARPresenter(C19EG c19eg, InterfaceC524950KiL interfaceC524950KiL, C21366718jZ c21366718jZ, InterfaceC21361218ig interfaceC21361218ig, InterfaceC537140L4u interfaceC537140L4u, C1621130sHv c1621130sHv, AwS604S0100000_25 awS604S0100000_25, Function2 function2, boolean z, AwS674S0100000_25 awS674S0100000_25, AwS639S0100000_25 awS639S0100000_25, InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1685430txd interfaceC1685430txd, InterfaceC1631630sYr interfaceC1631630sYr2, InterfaceC1631620sYq interfaceC1631620sYq, c cVar, LiveData liveData, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC21362218iq interfaceC21362218iq, ArrayList arrayList, InterfaceC540220LGq interfaceC540220LGq, Function1 function1, Function1 function12, AwS569S0100000_25 awS569S0100000_25, boolean z2, Scene scene, boolean z3, Fragment fragment, boolean z4, Function0 function0, Function0 function02, AFwS266S0000000_25 aFwS266S0000000_25, AwS569S0100000_25 awS569S0100000_252, LiveData liveData2, boolean z5, int i, int i2) {
        AFwS217S0000000_28 aFwS217S0000000_28;
        AFwS217S0000000_28 aFwS217S0000000_282;
        LifecycleOwner lifecycleOwner;
        ViewModelProvider viewModelProviderOf;
        AwS674S0100000_25 awS674S0100000_252 = awS674S0100000_25;
        boolean z6 = z;
        Function2 function22 = function2;
        C1621130sHv c1621130sHv2 = c1621130sHv;
        AwS604S0100000_25 awS604S0100000_252 = awS604S0100000_25;
        ArrayList arrayList2 = arrayList;
        boolean z7 = z5;
        AwS569S0100000_25 awS569S0100000_253 = awS569S0100000_252;
        InterfaceC1685430txd interfaceC1685430txd2 = interfaceC1685430txd;
        Function1<Effect, Boolean> function13 = aFwS266S0000000_25;
        Function1 function14 = function12;
        Function0 function03 = function02;
        Function0 function04 = function0;
        boolean z8 = z4;
        Fragment fragment2 = fragment;
        Function1 function15 = function1;
        Scene scene2 = scene;
        boolean z9 = z2;
        boolean z10 = z3;
        InterfaceC540220LGq interfaceC540220LGq2 = interfaceC540220LGq;
        Function0<String> function05 = awS569S0100000_25;
        InterfaceC21362218iq interfaceC21362218iq2 = interfaceC21362218iq;
        InterfaceC1631630sYr interfaceC1631630sYr3 = interfaceC1631630sYr;
        LiveData liveData3 = liveData2;
        AwS639S0100000_25 awS639S0100000_252 = awS639S0100000_25;
        InterfaceC524950KiL interfaceC524950KiL2 = (i & 2) != 0 ? null : interfaceC524950KiL;
        c1621130sHv2 = (i & 32) != 0 ? null : c1621130sHv2;
        awS604S0100000_252 = (i & 128) != 0 ? null : awS604S0100000_252;
        function22 = (i & 256) != 0 ? null : function22;
        z6 = (i & 512) != 0 ? false : z6;
        awS674S0100000_252 = (i & 1024) != 0 ? null : awS674S0100000_252;
        awS639S0100000_252 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : awS639S0100000_252;
        interfaceC1631630sYr3 = (i & 8192) != 0 ? null : interfaceC1631630sYr3;
        interfaceC1685430txd2 = (i & 16384) != 0 ? null : interfaceC1685430txd2;
        interfaceC21362218iq2 = (1048576 & i) != 0 ? null : interfaceC21362218iq2;
        arrayList2 = (4194304 & i) != 0 ? null : arrayList2;
        if ((16777216 & i) != 0) {
            aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(390);
        } else {
            aFwS217S0000000_28 = null;
        }
        interfaceC540220LGq2 = (33554432 & i) != 0 ? null : interfaceC540220LGq2;
        function15 = (67108864 & i) != 0 ? AFwS231S0000000_3.get$arr$(80) : function15;
        function14 = (134217728 & i) != 0 ? AFwS278S0000000_32.get$arr$(97) : function14;
        if ((268435456 & i) != 0) {
            aFwS217S0000000_282 = AFwS217S0000000_28.get$arr$(391);
        } else {
            aFwS217S0000000_282 = null;
        }
        function05 = (1073741824 & i) != 0 ? AFwS223S0000000_32.get$arr$(109) : function05;
        z9 = (i & Integer.MIN_VALUE) != 0 ? false : z9;
        scene2 = (i2 & 1) != 0 ? null : scene2;
        z10 = (i2 & 2) != 0 ? false : z10;
        fragment2 = (i2 & 4) != 0 ? null : fragment2;
        z8 = (i2 & 8) != 0 ? false : z8;
        function04 = (i2 & 16) != 0 ? null : function04;
        function03 = (i2 & 32) != 0 ? null : function03;
        function13 = (i2 & 64) != 0 ? AFwS231S0000000_3.get$arr$(81) : function13;
        awS569S0100000_253 = (i2 & 128) != 0 ? null : awS569S0100000_253;
        liveData3 = (i2 & 256) != 0 ? null : liveData3;
        z7 = (i2 & 512) != 0 ? false : z7;
        this.LLILLL = c19eg;
        this.LLILZ = interfaceC524950KiL2;
        this.LLILZIL = c21366718jZ;
        this.LLILZLL = interfaceC21361218ig;
        this.LLIZ = interfaceC537140L4u;
        this.LLIZLLLIL = c1621130sHv2;
        this.LLJ = null;
        this.LLJI = awS604S0100000_252;
        this.LLJIJIL = function22;
        this.LLJILJIL = z6;
        this.LLJILJILJ = awS674S0100000_252;
        this.LLJILLL = awS639S0100000_252;
        this.LLJJ = null;
        this.LLJJI = interfaceC1631630sYr3;
        this.LLJJIII = interfaceC1685430txd2;
        this.LLJJIJI = interfaceC1631630sYr2;
        this.LLJJIJIIJIL = interfaceC1631620sYq;
        this.LLJJIJIL = cVar;
        this.LLJJJ = liveData;
        this.LLJJJIL = interfaceC1624480sNK;
        this.LLJJJJ = interfaceC21362218iq2;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = arrayList2;
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = aFwS217S0000000_28;
        this.LLJL = interfaceC540220LGq2;
        this.LLJLIL = function15;
        this.LLJLILLLLZIIL = function14;
        this.LLJLL = aFwS217S0000000_282;
        this.LLJLLIL = false;
        this.LLJLLL = function05;
        this.LLJZ = z9;
        this.LLJZIJLIL = z10;
        this.LLL = fragment2;
        this.LLLF = z8;
        this.LLLFF = function04;
        this.LLLFFI = function03;
        this.LLLFZ = function13;
        this.LLLI = awS569S0100000_253;
        this.LLLII = liveData3;
        this.LLLIIII = z7;
        this.LLLILZ = new C21356918hz();
        this.LLLJ = new ArrayList<>();
        this.LLLL = System.currentTimeMillis();
        this.LLLLIILL = new ArrayList();
        this.LLLLIILLL = 2;
        this.LLLLIL = 5;
        this.LLLLILI = true;
        this.LLLLJI = new ArrayList();
        this.LLLLL = EnumC19387410t6.DEFAULT;
        this.LLLLLJIL = "";
        this.LLLLLJLJLL = "default";
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLLLLLJ = mutableLiveData;
        this.LLLLLLL = mutableLiveData;
        this.LLLLLLLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(110));
        this.LLLLLLLLLL = new ArrayList();
        this.LLLLLLZ = new C21361718il();
        this.LLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 341));
        if (scene2 != null) {
            lifecycleOwner = scene2;
        } else if (fragment2 == null) {
            lifecycleOwner = c19eg;
        } else {
            lifecycleOwner = fragment2;
        }
        this.LLLLLZIL = lifecycleOwner;
        this.LLLLLZL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 340));
        lifecycleOwner.getLifecycle().addObserver(this);
        if (scene2 != null) {
            viewModelProviderOf = C1659630tI1.LJIIIIZZ(scene2, null, null, 6);
        } else if (fragment2 instanceof ViewModelStoreOwner) {
            viewModelProviderOf = new ViewModelProvider(fragment2);
        } else {
            viewModelProviderOf = ViewModelProviders.of(c19eg);
        }
        this.LLLIIIIL = viewModelProviderOf;
        UploadPicStickerMessageModule uploadPicStickerMessageModule = (UploadPicStickerMessageModule) viewModelProviderOf.get(UploadPicStickerMessageModule.class);
        uploadPicStickerMessageModule.vQ2().observe(this.LLLLLZIL, new AObserverS234S0100000_32(this, 38));
        C1624610sNX.LIZ.getClass();
        if (C1624610sNX.LIZJ) {
            ((LiveData) uploadPicStickerMessageModule.LL.getValue()).observe(this.LLLLLZIL, new AObserverS234S0100000_32(this, 28));
        }
        this.LLJJJ.observe(this.LLLLLZIL, new Observer() { // from class: X.0sNY
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<String> list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    C1624610sNX.LIZ.getClass();
                    C1624610sNX.LIZIZ = list;
                }
            }
        });
    }
}
