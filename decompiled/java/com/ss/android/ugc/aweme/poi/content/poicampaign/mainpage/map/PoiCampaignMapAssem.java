package com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map;

import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C0PEM;
import X.C1178040glG;
import X.C1178070glJ;
import X.C1178080glK;
import X.C1179470gnZ;
import X.C1179570gnj;
import X.C1180060goW;
import X.C1180490gpD;
import X.C1180740gpc;
import X.C1180860gpo;
import X.C1198060hHY;
import X.C1203050hPb;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C622680Oba;
import X.C723580SZw;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1203090hPf;
import X.EnumC1991007r2;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177110gjl;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AAListenerS329S0100000_18;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.PoiCampaignMapAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.cluster.PoiCampaignMarkerPicLoader;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.inner.PoiCampaignSharedViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCampaignMapAssem extends UIContentAssem implements IPoiCampaignMapAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C736950SvV LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;
    public InterfaceC1177250gjz LLJIJIL;
    public InterfaceC1177110gjl<C1178080glK> LLJILJIL;
    public PoiCampaignMarkerPicLoader LLJILJILJ;
    public C1178040glG LLJILLL;
    public FrameLayout LLJJ;
    public FrameLayout LLJJI;
    public TuxIconView LLJJIII;
    public ObjectAnimator LLJJIJI;
    public ScrollView LLJJIJIIJIL;
    public ObjectAnimator LLJJIJIL;
    public ObjectAnimator LLJJJ;
    public Integer LLJJJIL;
    public boolean LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCampaignMapAssem.class, "mapVM", "getMapVM()Lcom/ss/android/ugc/aweme/poi/content/poicampaign/mainpage/map/PoiCampaignMapVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1180490gpD Ho() {
        return (C1180490gpD) this.LLJI.getValue();
    }

    public final PoiCampaignMapVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiCampaignMapVM) assemVMLazy.getValue();
    }

    public final void Lo() {
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJIJIL;
        Float fValueOf = interfaceC1177250gjz != null ? Float.valueOf(interfaceC1177250gjz.LJIJJ()) : null;
        InterfaceC1177250gjz interfaceC1177250gjz2 = this.LLJIJIL;
        Float fValueOf2 = interfaceC1177250gjz2 != null ? Float.valueOf(interfaceC1177250gjz2.LJJIIJZLJL()) : null;
        C1178040glG c1178040glG = this.LLJILLL;
        if (c1178040glG != null) {
            c1178040glG.LIZ = fValueOf2 != null && fValueOf2.floatValue() > 0.0f && Intrinsics.LJ(fValueOf2, fValueOf);
        }
    }

    public PoiCampaignMapAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(302);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCampaignSharedViewModel.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(323);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((AbstractC738140SxQ) this, 974);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZLLLIL = new C736950SvV(c19719912DlLIZ, aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_18, c451610HnL, c723700Sa8);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiCampaignMapVM.class);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c19719912DlLIZ2, 972);
        AFwS256S0000000_18 aFwS256S0000000_182 = AFwS256S0000000_18.get$arr$(322);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS562S0100000_182, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((AbstractC738140SxQ) this, 973), aFwS256S0000000_182, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJ = assemVMLazy;
        this.LLJI = new C1559260qg8(new C723580SZw(this, C1180490gpD.class, "PoiCampaignHierarchyData"), checkSupervisorPrepared());
        this.LLJJJIL = 0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ObjectAnimator objectAnimator = this.LLJJIJI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        PoiCampaignSharedViewModel poiCampaignSharedViewModel = (PoiCampaignSharedViewModel) this.LLIZLLLIL.getValue();
        poiCampaignSharedViewModel.LLILZLL = null;
        poiCampaignSharedViewModel.setState(new AwS583S0100000_4(poiCampaignSharedViewModel, 263));
        poiCampaignSharedViewModel.listClear();
    }

    @C14EU
    public final void onPoiRetagAccomplished(C1198060hHY c1198060hHY) {
        if (c1198060hHY.LIZ == EnumC1991007r2.ADD_POI_ACCOMPLISHED_EVENT) {
            Jo().vQ2();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws IOException {
        String str;
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        Resources resources;
        InputStream inputStreamOpenRawResource;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (ScrollView) view.findViewById(R.id.u3e);
        C1179570gnj c1179570gnj = (C1179570gnj) view.findViewById(R.id.nzt);
        if (c1179570gnj != null) {
            c1179570gnj.setDisallowInterceptTouchEvent$poi_release(true);
        }
        this.LLJJ = (FrameLayout) view.findViewById(R.id.nzh);
        this.LLJJI = (FrameLayout) view.findViewById(R.id.nzq);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.nzp);
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(C1180060goW.LJII("#57000000"));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LJ = Integer.valueOf(C1180060goW.LJII("#33FFFFFF"));
            frameLayout.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        FrameLayout frameLayout2 = this.LLJJI;
        if (frameLayout2 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 62), frameLayout2);
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        ScrollView scrollView = this.LLJJIJIIJIL;
        if (scrollView != null) {
            scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0go8
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                    Float fValueOf;
                    FrameLayout frameLayout3;
                    ObjectAnimator objectAnimator;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("scrollY: ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", hideThreshold: ");
                    sbLIZ.append(iLIZIZ);
                    sbLIZ.append(", refreshIconContainer?.alpha: ");
                    FrameLayout frameLayout4 = this.LLJJI;
                    if (frameLayout4 != null) {
                        fValueOf = Float.valueOf(frameLayout4.getAlpha());
                    } else {
                        fValueOf = null;
                    }
                    sbLIZ.append(fValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (i2 <= iLIZIZ || (frameLayout3 = this.LLJJI) == null || frameLayout3.getAlpha() <= 0.0f || ((objectAnimator = this.LLJJJ) != null && objectAnimator.isStarted())) {
                        if (i2 < iLIZIZ) {
                            FrameLayout frameLayout5 = this.LLJJI;
                            if (frameLayout5 == null || frameLayout5.getAlpha() < 1.0f) {
                                ObjectAnimator objectAnimator2 = this.LLJJIJIL;
                                if (objectAnimator2 != null && objectAnimator2.isStarted()) {
                                    return;
                                }
                                ObjectAnimator objectAnimator3 = this.LLJJJ;
                                if (objectAnimator3 != null) {
                                    objectAnimator3.cancel();
                                }
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJI, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                                PoiCampaignMapAssem poiCampaignMapAssem = this;
                                objectAnimatorOfFloat.setDuration(250L);
                                objectAnimatorOfFloat.addListener(new AAListenerS329S0100000_18(poiCampaignMapAssem, 7));
                                poiCampaignMapAssem.LLJJIJIL = objectAnimatorOfFloat;
                                C786410Ut5.Pd(objectAnimatorOfFloat);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ObjectAnimator objectAnimator4 = this.LLJJIJIL;
                    if (objectAnimator4 != null) {
                        objectAnimator4.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJJI, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                    PoiCampaignMapAssem poiCampaignMapAssem2 = this;
                    objectAnimatorOfFloat2.setDuration(250L);
                    objectAnimatorOfFloat2.addListener(new AAListenerS329S0100000_18(poiCampaignMapAssem2, 6));
                    poiCampaignMapAssem2.LLJJJ = objectAnimatorOfFloat2;
                    C786410Ut5.Pd(objectAnimatorOfFloat2);
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(view.getContext(), null);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZ = 2;
        viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
        ((AssemListViewModel) this.LLIZLLLIL.getValue()).setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        final PoiCampaignSharedViewModel poiCampaignSharedViewModel = (PoiCampaignSharedViewModel) this.LLIZLLLIL.getValue();
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(poiCampaignSharedViewModel) { // from class: X.0Cqr
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        C1180740gpc.LIZ.getClass();
        IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
        C1179470gnZ c1179470gnZ = new C1179470gnZ();
        c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
        c1179470gnZ.LIZJ = false;
        c1179470gnZ.LJ = false;
        c1179470gnZ.LJII = false;
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (inputStreamOpenRawResource = resources.openRawResource(R.raw.nearby_discovery_map_style)) != null) {
            byte[] bArr = new byte[inputStreamOpenRawResource.available()];
            inputStreamOpenRawResource.read(bArr);
            str = new String(bArr, Charset.defaultCharset());
        } else {
            str = null;
        }
        c1179470gnZ.LJI = str;
        InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
        Fragment fragmentLIZIZ = iMapManager.LIZIZ();
        if (fragmentLIZIZ != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LIZIZ(R.id.nzh, fragmentLIZIZ);
            c19ehLJIIJ.LJIIIZ();
        }
        iMapManager.X(new AwS597S0100000_18(this, 793));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IPoiCampaignMapAbility.class, null, this);
        }
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.IPoiCampaignMapAbility
    public final void zn0(AwS597S0100000_18 awS597S0100000_18) {
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJIJIL;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LJII(new AwS597S0100000_18(awS597S0100000_18, 794));
        }
    }

    public final void Go(List<C1178080glK> list, boolean z) {
        if (list == null) {
            return;
        }
        InterfaceC1177110gjl<C1178080glK> interfaceC1177110gjl = this.LLJILJIL;
        if (interfaceC1177110gjl != null) {
            interfaceC1177110gjl.clearData();
        }
        InterfaceC1177110gjl<C1178080glK> interfaceC1177110gjl2 = this.LLJILJIL;
        if (interfaceC1177110gjl2 != null) {
            interfaceC1177110gjl2.LJII(list);
        }
        InterfaceC1177110gjl<C1178080glK> interfaceC1177110gjl3 = this.LLJILJIL;
        if (interfaceC1177110gjl3 != null) {
            interfaceC1177110gjl3.LJIIIIZZ();
        }
        PoiCampaignMarkerPicLoader poiCampaignMarkerPicLoader = this.LLJILJILJ;
        if (poiCampaignMarkerPicLoader != null) {
            AnonymousClass0956 anonymousClass0956 = poiCampaignMarkerPicLoader.LLILLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            poiCampaignMarkerPicLoader.LLILLL = C23250099c.LIZLLL(poiCampaignMarkerPicLoader, C0PEM.LIZJ, null, new C1178070glJ(list, poiCampaignMarkerPicLoader, null), 2);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(Jo()), C0PEM.LIZJ, null, new C1180860gpo(this, z, null), 2);
    }
}
