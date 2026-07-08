package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C01D1;
import X.C09R3;
import X.C1174720gfu;
import X.C1177790gkr;
import X.C1180060goW;
import X.C11NZ;
import X.C1209020hZE;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C16G0;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC1175940ghs;
import X.InterfaceC1177950gl7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS87S0200000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetSlideAbility;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailSheetAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.poi.mapmode.behavior.PoiMapModeSheetBehavior;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailSheetAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public Fragment LLJI;
    public C16G0 LLJIJIL;
    public C1177790gkr LLJILJIL;
    public final PoiMapModeSheetBehavior LLJILJILJ;
    public TuxNavBar LLJILLL;
    public View LLJJ;
    public ViewGroup LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailSheetAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapDetailSheetAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailFilterVM;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(161));
    }

    public PoiMapDetailSheetAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1405), AFwS256S0000000_18.get$arr$(486), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailFilterVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1406), AFwS256S0000000_18.get$arr$(487), null, true);
        this.LLJILJILJ = new PoiMapModeSheetBehavior();
    }

    public static int Ho() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(161));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[PHI: r2
      0x001b: PHI (r2v2 java.lang.Integer) = (r2v0 java.lang.Integer), (r2v3 java.lang.Integer) binds: [B:31:0x00a5, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Lo() {
        /*
            r4 = this;
            com.bytedance.tux.navigation.TuxNavBar r0 = r4.LLJILLL
            r1 = 0
            if (r0 == 0) goto L84
            int r0 = r0.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r2.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C08A4.LIZ(r0)
            if (r0 == 0) goto L84
        L1b:
            int r3 = r2.intValue()
        L1f:
            X.19EG r2 = X.C724240Sb0.LIZ(r4)
            if (r2 == 0) goto L57
            X.0IMo r0 = X.C0IKF.LIZ
            r0.getClass()
            X.C465320IMo.LIZ()
            X.12Ko r0 = X.C19738212Km.LIZ(r2)
            android.graphics.Rect r0 = r0.LIZ()
            int r1 = r0.height()
        L39:
            android.view.View r0 = r4.LJJIJL()
            android.content.Context r0 = r0.getContext()
            int r0 = com.ss.android.ugc.aweme.shortvideo.ScreenUtils.getStatusBarHeight(r0)
            int r1 = r1 - r3
            int r1 = r1 - r0
            r0 = 60
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r1 = r1 - r0
            return r1
        L57:
            X.16G0 r0 = r4.LLJIJIL
            if (r0 == 0) goto L5f
            android.view.ViewParent r1 = r0.getParent()
        L5f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L82
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L82
            int r0 = r1.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C08A4.LIZ(r0)
            if (r0 == 0) goto L82
            int r1 = r1.intValue()
            goto L39
        L82:
            r1 = 0
            goto L39
        L84:
            com.bytedance.tux.navigation.TuxNavBar r0 = r4.LLJILLL
            if (r0 == 0) goto L8b
            X.C1180060goW.LJIILIIL(r0)
        L8b:
            com.bytedance.tux.navigation.TuxNavBar r0 = r4.LLJILLL
            if (r0 == 0) goto La9
            int r0 = r0.getMeasuredHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto La9
            int r0 = r2.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C08A4.LIZ(r0)
            if (r0 == 0) goto La9
            goto L1b
        La9:
            r0 = 52
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r3 = X.C814420VxA.LIZIZ(r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailSheetAssem.Lo():int");
    }

    public final PoiMapDetailPageVM No() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PoiMapDetailPageVM) assemVMLazy.getValue();
    }

    public final void Oo() {
        C16G0 c16g0 = this.LLJIJIL;
        if (c16g0 == null || (this.LLJI instanceof PoiMapDetailVerticalListFragment)) {
            return;
        }
        PoiMapDetailVerticalListFragment.LLJIJIL.getClass();
        PoiMapDetailVerticalListFragment poiMapDetailVerticalListFragment = new PoiMapDetailVerticalListFragment();
        C1177790gkr c1177790gkr = this.LLJILJIL;
        if (c1177790gkr != null) {
            c1177790gkr.LJ(poiMapDetailVerticalListFragment);
            this.LLJI = poiMapDetailVerticalListFragment;
            return;
        }
        int iLo = Lo();
        C1180060goW.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + iLo, c16g0);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1174720gfu c1174720gfu = new C1174720gfu();
            C1177790gkr c1177790gkr2 = c1174720gfu.LIZ;
            c1177790gkr2.LIZ = c16g0;
            c1177790gkr2.LIZIZ = false;
            c1177790gkr2.LJI = true;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(157));
            c1174720gfu.LIZ.LJ = Integer.valueOf(iLIZIZ);
            c1174720gfu.LIZ.LIZJ = Integer.valueOf(iLo);
            c1174720gfu.LIZ.LJIILIIL = true;
            PoiMapModeSheetBehavior poiMapModeSheetBehavior = this.LLJILJILJ;
            poiMapModeSheetBehavior.setFitToContents(false);
            poiMapModeSheetBehavior.setHalfExpandedRatio(Jo(iLo));
            c1174720gfu.LIZ.LJIIIZ = poiMapModeSheetBehavior;
            FragmentManager parentFragmentManager = fragmentLJI.getParentFragmentManager();
            C1177790gkr c1177790gkr3 = c1174720gfu.LIZ;
            c1177790gkr3.LJII = poiMapDetailVerticalListFragment;
            c1177790gkr3.LJIIIIZZ = parentFragmentManager;
            c1177790gkr3.LJIIJ = new InterfaceC1177950gl7() { // from class: X.0ghe
                @Override // X.InterfaceC1177950gl7
                public final void LIZ(int i, boolean z) {
                    String str;
                    Integer userCityStatus;
                    String str2;
                    PoiMapDetailSheetAssem poiMapDetailSheetAssem = this.LIZ;
                    String strLIZ = null;
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                poiMapDetailSheetAssem.getClass();
                            } else {
                                C1175770ghb c1175770ghb = poiMapDetailSheetAssem.No().LL;
                                C1175770ghb c1175770ghb2 = poiMapDetailSheetAssem.No().LL;
                                c1175770ghb.LIZ.BQ2(null, true);
                                EnumC1175790ghd enumC1175790ghd = c1175770ghb.LIZIZ;
                                if (enumC1175790ghd != null) {
                                    enumC1175790ghd.onSheetSwipedToFive(c1175770ghb2);
                                }
                            }
                        } else {
                            C1175770ghb c1175770ghb3 = poiMapDetailSheetAssem.No().LL;
                            C1175770ghb c1175770ghb4 = poiMapDetailSheetAssem.No().LL;
                            c1175770ghb3.LIZ.BQ2(null, true);
                            EnumC1175790ghd enumC1175790ghd2 = c1175770ghb3.LIZIZ;
                            if (enumC1175790ghd2 != null) {
                                enumC1175790ghd2.onSheetSwipedToThree(c1175770ghb4);
                            }
                        }
                    } else {
                        C1175770ghb c1175770ghb5 = poiMapDetailSheetAssem.No().LL;
                        C1175770ghb c1175770ghb6 = poiMapDetailSheetAssem.No().LL;
                        c1175770ghb5.LIZ.BQ2(null, true);
                        EnumC1175790ghd enumC1175790ghd3 = c1175770ghb5.LIZIZ;
                        if (enumC1175790ghd3 != null) {
                            enumC1175790ghd3.onSheetSwipedToNine(c1175770ghb6);
                        }
                    }
                    if (z) {
                        C1175660ghQ c1175660ghQ = this.LIZ.No().getState().LLILLL;
                        if (c1175660ghQ != null) {
                            str = c1175660ghQ.localServiceKeyCategory;
                        } else {
                            str = null;
                        }
                        PoiMapDetailResponse poiMapDetailResponse = this.LIZ.No().LLJILJILJ.LIZJ;
                        if (poiMapDetailResponse != null) {
                            userCityStatus = poiMapDetailResponse.getUserCityStatus();
                        } else {
                            userCityStatus = null;
                        }
                        AssemVMLazy assemVMLazy = this.LIZ.LLJ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiMapDetailSheetAssem.LLJJIJIIJIL;
                        String strWQ2 = ((PoiMapDetailFilterVM) assemVMLazy.getValue()).wQ2();
                        if (i == 3) {
                            str2 = "9";
                        } else {
                            str2 = "1";
                        }
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this.LIZ);
                        PageFinder pageFinder = this.LIZ.No().LLJ;
                        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJIIL);
                        if (str != null) {
                            strLIZ = C1175600ghK.LIZ(str);
                        }
                        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
                        C1189060h32.LJJ("map_mode_type", C1175600ghK.LJIIJ(userCityStatus), linkedHashMap);
                        C1189060h32.LJJ("ttls_filter_type_list", strWQ2, linkedHashMap);
                        C1189060h32.LJJ("poi_list_type", str2, linkedHashMap);
                        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
                        c1185040gwY.getClass();
                        C1185040gwY.LIZIZ("ttls_poi_map_list_drag", linkedHashMap, c1185050gwZ);
                    }
                }
            };
            c1177790gkr3.LJIIJJI = new InterfaceC1175940ghs() { // from class: X.0ghp
                @Override // X.InterfaceC1175940ghs
                public final void LJJJI(float f) {
                    InterfaceC665370Q7z interfaceC665370Q7z;
                    IPoiMapDetailMapAssemAbility iPoiMapDetailMapAssemAbility;
                    IPoiMapDetailSheetSlideAbility iPoiMapDetailSheetSlideAbility;
                    int iLIZIZ2;
                    Context context;
                    PoiMapDetailSheetAssem poiMapDetailSheetAssem = this.LIZ;
                    EnumC1175790ghd enumC1175790ghd = poiMapDetailSheetAssem.No().getState().LL;
                    EnumC1175790ghd enumC1175790ghd2 = EnumC1175790ghd.CARD_VIEW;
                    if (enumC1175790ghd != enumC1175790ghd2) {
                        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(161));
                        C16G0 c16g02 = poiMapDetailSheetAssem.LLJIJIL;
                        if (c16g02 != null) {
                            context = c16g02.getContext();
                        } else {
                            context = null;
                        }
                        float screenHeight = (ScreenUtils.getScreenHeight(context) / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                        float fLo = poiMapDetailSheetAssem.Lo() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        float f2 = iLIZIZ3;
                        float f3 = 0.0f;
                        if (f >= 0.0f) {
                            f3 = f;
                        }
                        float f4 = (f3 * (fLo - f2)) + f2;
                        if (f4 <= screenHeight) {
                            screenHeight = f4;
                        }
                        if (screenHeight >= f2) {
                            f2 = screenHeight;
                        }
                        int i = (int) f2;
                        poiMapDetailSheetAssem.LLJJIII = i;
                        View view = poiMapDetailSheetAssem.LLJJ;
                        if (view != null) {
                            C1189060h32.LJJII(view, null, null, null, Integer.valueOf(i));
                        }
                        ViewGroup viewGroup = poiMapDetailSheetAssem.LLJJI;
                        if (viewGroup != null) {
                            C1189060h32.LJJII(viewGroup, null, null, null, Integer.valueOf(i));
                        }
                        poiMapDetailSheetAssem.LLJJIJI = true;
                    }
                    InterfaceC665370Q7z interfaceC665370Q7z2 = this.LIZ.No().LLIZ;
                    if (interfaceC665370Q7z2 != null && (iPoiMapDetailSheetSlideAbility = (IPoiMapDetailSheetSlideAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IPoiMapDetailSheetSlideAbility.class, null)) != null) {
                        PoiMapDetailSheetAssem poiMapDetailSheetAssem2 = this.LIZ;
                        if (poiMapDetailSheetAssem2.No().getState().LL == enumC1175790ghd2) {
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(157));
                        } else {
                            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(157));
                            float fLo2 = poiMapDetailSheetAssem2.Lo();
                            float f5 = iLIZIZ4;
                            float f6 = 0.45f;
                            if (f >= 0.45f) {
                                f6 = f;
                            }
                            iLIZIZ2 = (int) (f5 + (f6 * (fLo2 - f5)));
                        }
                        iPoiMapDetailSheetSlideAbility.Og(iLIZIZ2 - C1174710gft.LIZ());
                    }
                    if ((this.LIZ.No().getState().LL == EnumC1175790ghd.POI_LIST_FIVE_SHEET || this.LIZ.No().getState().LL == EnumC1175790ghd.POI_LIST_THREE_SHEET) && (interfaceC665370Q7z = this.LIZ.No().LLIZ) != null && (iPoiMapDetailMapAssemAbility = (IPoiMapDetailMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapDetailMapAssemAbility.class, null)) != null) {
                        iPoiMapDetailMapAssemAbility.uD0((int) this.LIZ.LLJJIII);
                    }
                }
            };
            c1177790gkr3.LIZLLL();
            this.LLJILJIL = c1177790gkr3;
            this.LLJI = poiMapDetailVerticalListFragment;
        }
    }

    public final int Go() {
        return ((int) ((r2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) * Jo(Lo()))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public final float Jo(int i) {
        return ((ScreenUtils.getScreenHeight(LJJIJL().getContext()) / 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) / (i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C16G0 c16g0 = (C16G0) view.findViewById(R.id.v4l);
        if (c16g0 == null) {
            return;
        }
        this.LLJIJIL = c16g0;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar == null) {
            return;
        }
        this.LLJILLL = tuxNavBar;
        this.LLJJ = view.findViewById(R.id.nzk);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.msa);
        InterfaceC665370Q7z interfaceC665370Q7z = No().LLIZ;
        if (interfaceC665370Q7z != null) {
            IPoiMapDetailSheetAssemAbility iPoiMapDetailSheetAssemAbility = new IPoiMapDetailSheetAssemAbility() { // from class: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailSheetAssem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetAssemAbility
                public final int YK2() {
                    return this.LL.Lo();
                }

                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetAssemAbility
                public final int an1() {
                    this.LL.getClass();
                    return PoiMapDetailSheetAssem.Ho();
                }

                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetAssemAbility
                public final int ok2() {
                    return this.LL.Go();
                }

                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetAssemAbility
                public final C11NZ<Integer> p3() {
                    return C11NZ.LJIJJLI(new C1209020hZE(this.LL, 0));
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapDetailSheetAssemAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, iPoiMapDetailSheetAssemAbility, IPoiMapDetailSheetAssemAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiMapDetailSheetAssemAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiMapDetailSheetAssemAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiMapDetailSheetAssemAbility.class.getClassLoader(), new Class[]{IPoiMapDetailSheetAssemAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiMapDetailSheetAssemAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetAssemAbility");
                    }
                }
            }
        }
        C16G0 c16g02 = this.LLJIJIL;
        if (c16g02 != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c16g02, new ARunnableS87S0200000_18(c16g02, this, 0));
        }
    }
}
