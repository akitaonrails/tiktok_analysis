package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.soundcontrol.ui;

import X.C0HHT;
import X.C0PRC;
import X.C0SVP;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2174741A9g;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2367809Po;
import X.C301290BrT;
import X.C427690Gpr;
import X.C646370PWx;
import X.C654550Plt;
import X.C657280PqI;
import X.C658830Psn;
import X.C658840Pso;
import X.C659060PtA;
import X.C659070PtB;
import X.C659080PtC;
import X.C661460Px2;
import X.C661470Px3;
import X.C663180Pzo;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC655500PnQ;
import X.EnumC658820Psm;
import X.InterfaceC1146704e9;
import X.InterfaceC1399350mWD;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435460H5s;
import X.InterfaceC583720Muw;
import X.InterfaceC655270Pn3;
import X.InterfaceC658500PsG;
import X.InterfaceC661540PxA;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.soundcontrol.ui.SearchMediaSoundIconAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.viewmodel.SearchMediaPlayStateVM;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaSoundIconAssem extends ReusedUIContentAssem<SearchMediaSoundIconAssem> implements InterfaceC658500PsG, View.OnAttachStateChangeListener, InterfaceC1399350mWD, InterfaceC712990Rxx<InterfaceC435460H5s>, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public SearchMediaSoundIconVM LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public SearchComponentCenter$Player$PlayerControlAbility LLJJJJLIIL;
    public final C1559260qg8 LLJJL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;
    public final SearchMediaSoundIconAssem LLJLIL;
    public final List<Function1<Boolean, Unit>> LLJLILLLLZIIL;
    public final List<Function0<Unit>> LLJLL;
    public TuxIconView LLJLLIL;
    public boolean LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMediaSoundIconAssem.class, "playStateVM", "getPlayStateVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/mediaplayer/viewmodel/SearchMediaPlayStateVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchMediaSoundIconAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMediaPlayStateVM.class);
        this.LLJJJJJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 248), null, AFwS241S0000000_10.get$arr$(154));
        this.LLJJL = new C1559260qg8(new C723580SZw(this, C658840Pso.class, null), checkSupervisorPrepared());
        this.LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C654550Plt.class, null), checkSupervisorPrepared());
        this.LLJL = new C1559260qg8(new C723580SZw(this, C657280PqI.class, null), checkSupervisorPrepared());
        this.LLJLIL = this;
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLL = new ArrayList();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final Map<String, String> getMobParams() {
        Function0<? extends Map<String, String>> function0;
        Map<String, String> mapInvoke;
        Function0<? extends Map<String, String>> function02;
        Map<String, String> mapInvoke2;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("switch_status", C659080PtC.LIZIZ() ? "off" : "on");
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), ISearchContextAbility.class);
        C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
        linkedHashMap.put("search_id", c0prc.LLILLL);
        linkedHashMap.put("search_keyword", c0prc.LLIZLLLIL);
        linkedHashMap.put("enter_from", ((C646370PWx) iSearchContextAbility.wO2().LIZJ()).LLILLL);
        linkedHashMap.put("search_type", "general");
        linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("switch_status", C659080PtC.LIZIZ() ? "off" : "on");
        C658840Pso c658840Pso = (C658840Pso) this.LLJJL.getValue();
        if (c658840Pso != null && (map = c658840Pso.LIZ) != null) {
            linkedHashMap.putAll(map);
        }
        C654550Plt c654550Plt = (C654550Plt) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c654550Plt != null && (function02 = c654550Plt.LLJJIJIIJIL) != null && (mapInvoke2 = function02.invoke()) != null) {
            linkedHashMap.putAll(mapInvoke2);
        }
        C657280PqI c657280PqI = (C657280PqI) this.LLJL.getValue();
        if (c657280PqI != null && (function0 = c657280PqI.LLJIJIL) != null && (mapInvoke = function0.invoke()) != null) {
            linkedHashMap.putAll(mapInvoke);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC658500PsG
    public final boolean mh() {
        MutableLiveData mutableLiveData;
        SearchMediaSoundIconVM searchMediaSoundIconVM = this.LLJJJJ;
        Object value = (searchMediaSoundIconVM == null || (mutableLiveData = searchMediaSoundIconVM.LLILZ) == null) ? null : mutableLiveData.getValue();
        TuxIconView tuxIconView = this.LLJLLIL;
        if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
            return false;
        }
        return value == EnumC658820Psm.SOUND_ON || value == EnumC658820Psm.SOUND_OFF;
    }

    public final Map<String, String> cp() {
        Map<String, String> mobParams = getMobParams();
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((InterfaceC435460H5s) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        mobParams.put("group_id", aid);
        return mobParams;
    }

    public final void ep() {
        MutableLiveData<EnumC658820Psm> mutableLiveData;
        C659080PtC.LJFF();
        EnumC658820Psm enumC658820Psm = C2367809Po.LIZ() ? C659080PtC.LIZIZ == 0 ? this.LLJLLL ? EnumC658820Psm.COPYRIGHT_MUTE : EnumC658820Psm.SOUND_ON : EnumC658820Psm.SOUND_OFF : this.LLJLLL ? EnumC658820Psm.COPYRIGHT_MUTE : EnumC658820Psm.NOTING;
        SearchMediaSoundIconVM searchMediaSoundIconVM = this.LLJJJJ;
        if (searchMediaSoundIconVM != null && (mutableLiveData = searchMediaSoundIconVM.LLILLL) != null) {
            mutableLiveData.setValue(enumC658820Psm);
        }
        SearchMediaSoundIconVM searchMediaSoundIconVM2 = this.LLJJJJ;
        if (searchMediaSoundIconVM2 != null) {
            searchMediaSoundIconVM2.LL.setValue(Boolean.TRUE);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchPlayerScope.class}).unbindAbility(this.LLJLIL, InterfaceC658500PsG.class);
    }

    public final void hp(EnumC658820Psm enumC658820Psm) {
        Resources resources;
        String string;
        Resources resources2;
        String string2;
        Object obj;
        int i = C658830Psn.LIZ[enumC658820Psm.ordinal()];
        String str = "";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        TuxIconView tuxIconView = this.LLJLLIL;
                        if (tuxIconView != null) {
                            tuxIconView.setTuxIcon(null);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                TuxIconView tuxIconView2 = this.LLJLLIL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(R.raw.icon_music_note_s_alt_slash);
                }
                TuxIconView tuxIconView3 = this.LLJLLIL;
                if (tuxIconView3 != null) {
                    tuxIconView3.setTintColorRes(R.attr.zk);
                }
                C659060PtA c659060PtA = C659060PtA.LIZ;
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((InterfaceC435460H5s) obj).getAweme();
                Map<String, String> mapCp = cp();
                c659060PtA.getClass();
                C659060PtA.LIZIZ("sounds_remove_show", aweme, null, mapCp);
                TuxIconView tuxIconView4 = this.LLJLLIL;
                if (tuxIconView4 == null) {
                    return;
                }
                tuxIconView4.setContentDescription("");
                return;
            }
            TuxIconView tuxIconView5 = this.LLJLLIL;
            if (tuxIconView5 != null) {
                tuxIconView5.setIconRes(R.raw.icon_speaker_2_ltr);
            }
            TuxIconView tuxIconView6 = this.LLJLLIL;
            if (tuxIconView6 != null) {
                tuxIconView6.setTintColorRes(R.attr.zi);
            }
            TuxIconView tuxIconView7 = this.LLJLLIL;
            if (tuxIconView7 == null) {
                return;
            }
            Context context = getContext();
            if (context != null && (resources2 = context.getResources()) != null && (string2 = resources2.getString(2131831580)) != null) {
                str = string2;
            }
            tuxIconView7.setContentDescription(str);
            return;
        }
        TuxIconView tuxIconView8 = this.LLJLLIL;
        if (tuxIconView8 != null) {
            tuxIconView8.setIconRes(R.raw.icon_speaker_x_mark_ltr);
        }
        TuxIconView tuxIconView9 = this.LLJLLIL;
        if (tuxIconView9 != null) {
            tuxIconView9.setTintColorRes(R.attr.zi);
        }
        TuxIconView tuxIconView10 = this.LLJLLIL;
        if (tuxIconView10 == null) {
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(2131831578)) != null) {
            str = string;
        }
        tuxIconView10.setContentDescription(str);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view, c19egLIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof TuxIconView) {
            tuxIconView = (TuxIconView) viewLJJIJL;
        } else {
            tuxIconView = null;
        }
        this.LLJLLIL = tuxIconView;
        if (tuxIconView != null) {
            C427690Gpr.LJI(tuxIconView, null);
        }
        TuxIconView tuxIconView2 = this.LLJLLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS145S0100000_10(this, 46));
        }
        C663180Pzo c663180Pzo = C663180Pzo.LIZ;
        TuxIconView tuxIconView3 = this.LLJLLIL;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 249);
        c663180Pzo.getClass();
        C663180Pzo.LIZIZ(tuxIconView3, awS554S0100000_10);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(this, LLJZ[0]), new C2217381BqS() { // from class: X.0Pss
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C658860Psq) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(41), 6);
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class);
        this.LLJJJJLIIL = searchComponentCenter$Player$PlayerControlAbility;
        searchComponentCenter$Player$PlayerControlAbility.Im2(new InterfaceC583720Muw() { // from class: X.0Psl
            @Override // X.InterfaceC583720Muw
            public final void LIZ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZJ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LJII() {
            }

            @Override // X.InterfaceC583720Muw
            public final void onBuffering(boolean z) {
            }

            @Override // X.InterfaceC583720Muw
            public final void onLoading() {
            }

            @Override // X.InterfaceC583720Muw
            public final void onPause() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LJJZ() {
                this.LIZ.ep();
                SearchMediaSoundIconAssem searchMediaSoundIconAssem = this.LIZ;
                SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility2 = searchMediaSoundIconAssem.LLJJJJLIIL;
                if (searchComponentCenter$Player$PlayerControlAbility2 != null) {
                    boolean z = C659080PtC.LIZ;
                    C724270Sb3 c724270Sb3 = searchMediaSoundIconAssem.LLJI;
                    searchComponentCenter$Player$PlayerControlAbility2.LJIILJJIL(C659080PtC.LIZ(1, 0, ((InterfaceC435460H5s) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()));
                }
            }
        });
        view.addOnAttachStateChangeListener(this);
        SearchMediaSoundIconVM searchMediaSoundIconVM = (SearchMediaSoundIconVM) new ViewModelProvider(this).get(SearchMediaSoundIconVM.class);
        this.LLJJJJ = searchMediaSoundIconVM;
        if (searchMediaSoundIconVM != null && (mutableLiveData2 = searchMediaSoundIconVM.LLILLJJLI) != null) {
            mutableLiveData2.observe(this, new AObserverS214S0100000_10(this, 99));
        }
        SearchMediaSoundIconVM searchMediaSoundIconVM2 = this.LLJJJJ;
        if (searchMediaSoundIconVM2 != null && (mutableLiveData = searchMediaSoundIconVM2.LLILZ) != null) {
            mutableLiveData.observe(this, new AObserverS214S0100000_10(this, 19));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view, c19egLIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchPlayerScope.class}).bindAbility(this.LLJLIL, InterfaceC658500PsG.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC435460H5s interfaceC435460H5s) {
        InterfaceC435460H5s interfaceC435460H5s2 = interfaceC435460H5s;
        SearchMediaSoundIconVM searchMediaSoundIconVM = this.LLJJJJ;
        if (searchMediaSoundIconVM != null) {
            EnumC658820Psm enumC658820Psm = EnumC658820Psm.NOTING;
            MutableLiveData<EnumC658820Psm> mutableLiveData = searchMediaSoundIconVM.LLILLL;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(enumC658820Psm);
            }
        }
        this.LLJLLL = C659070PtB.LIZ(interfaceC435460H5s2.getAweme());
        if (!C2367809Po.LIZ() && this.LLJLLL) {
            ep();
            return;
        }
        SearchMediaSoundIconVM searchMediaSoundIconVM2 = this.LLJJJJ;
        if (searchMediaSoundIconVM2 == null) {
            return;
        }
        searchMediaSoundIconVM2.LL.setValue(Boolean.FALSE);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC658500PsG
    public final void wb(EnumC658820Psm enumC658820Psm) {
        if (this.LLJLLL) {
            enumC658820Psm = EnumC658820Psm.COPYRIGHT_MUTE;
        }
        hp(enumC658820Psm);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    public final void dp(EnumC655500PnQ enumC655500PnQ, boolean z) {
        Object obj;
        String str;
        View viewLLLLLLLZIL;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            C659080PtC.LIZ = false;
            c2174741A9g.LJIILL("general_search", enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
        }
        int i = !C659080PtC.LIZIZ() ? 1 : 0;
        C659080PtC.LIZJ(i);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        boolean zLIZ = C659080PtC.LIZ(1, 0, ((InterfaceC435460H5s) obj).getAweme());
        if (z) {
            Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(Boolean.valueOf(zLIZ));
            }
        }
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = this.LLJJJJLIIL;
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.LJIILJJIL(zLIZ);
        }
        ep();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C659080PtC.LIZIZ()) {
            str = "off";
        } else {
            str = "on";
        }
        c2344009Gk.LJIIIIZZ("switch_status", str);
        c2344009Gk.LJII(getMobParams());
        C20684815ws.LJIILLIIL("sounds_switch_click", c2344009Gk.LIZ);
        if (C663180Pzo.LJI() && C301290BrT.LIZIZ() && i == 0) {
            SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility2 = this.LLJJJJLIIL;
            if (searchComponentCenter$Player$PlayerControlAbility2 != null) {
                viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility2.LLLLLLLZIL();
            } else {
                viewLLLLLLLZIL = null;
            }
            if (viewLLLLLLLZIL instanceof C661470Px3) {
                InterfaceC661540PxA interfaceC661540PxA = ((C661470Px3) viewLLLLLLLZIL).LLJ;
                if (interfaceC661540PxA != null) {
                    interfaceC661540PxA.LIZ();
                }
            } else if (viewLLLLLLLZIL instanceof C661460Px2) {
                ((C661460Px2) viewLLLLLLLZIL).setCurrentPhotoItem(0);
            }
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        Aweme aweme = ((InterfaceC435460H5s) obj2).getAweme();
        C663180Pzo c663180Pzo = C663180Pzo.LIZ;
        String aid = aweme.getAid();
        c663180Pzo.getClass();
        C663180Pzo.LJII(i, aid);
    }

    @Override // X.InterfaceC1399350mWD
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        EnumC655500PnQ enumC655500PnQ;
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = this.LLJJJJLIIL;
        if (searchComponentCenter$Player$PlayerControlAbility != null && searchComponentCenter$Player$PlayerControlAbility.isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL()) {
            if (i != 24) {
                if (i == 25) {
                    enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                }
            } else {
                enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
            }
            dp(enumC655500PnQ, false);
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
