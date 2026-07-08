package com.ss.android.ugc.aweme.poi.detail.container.background.map;

import X.C019F;
import X.C09R3;
import X.C1173300gdc;
import X.C1174730gfv;
import X.C1174850gg7;
import X.C1175180gge;
import X.C1175530ghD;
import X.C1177310gk5;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C1189060h32;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C166V;
import X.C1697810uHb;
import X.C18JG;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1175380ggy;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.MessageSyncer;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.CleanModeHeaderConfig;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi.mapmode.PoiMapModeFragment;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBackgroundMapAssem extends PoiDetailBaseUiSlotComponent<PoiDiscoveryApi$PoiDiscoveryCardListResponse> implements ContainerEventDispatcher$PageScrollCallBackAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C166V LLJJIJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 317));
    public final AssemVMLazy LLJJIJIIJIL;
    public InterfaceC1177250gjz LLJJIJIL;
    public int LLJJJ;
    public Animator LLJJJIL;
    public Animator LLJJJJ;
    public final MessageSyncer LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiBackgroundMapAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailBackgroundTopMapBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiBackgroundMapAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(223));
        LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    }

    public PoiBackgroundMapAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 543), AFwS256S0000000_18.get$arr$(369), null, true);
        this.LLJJJJJIL = new MessageSyncer();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dzd;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final boolean mp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void oq(int i) {
    }

    public final C1177310gk5 sp() {
        C166V c166v = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (C1177310gk5) c166v.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        CleanModeHeaderConfig cleanModeHeaderConfig;
        Integer num;
        PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) baseComponentData;
        super.CG1(poiDiscoveryApi$PoiDiscoveryCardListResponse);
        PoiListApi.PoiDetailResponse poiDetailResponseIp = ip();
        if (poiDetailResponseIp != null && (cleanModeHeaderConfig = poiDetailResponseIp.getCleanModeHeaderConfig()) != null && (num = cleanModeHeaderConfig.shouldShowShare) != null && num.intValue() == 1) {
            C786410Ut5.LJZ(8, sp().LLJ);
        }
        C786410Ut5.I7(new AkS57S0200000_18(this, poiDiscoveryApi$PoiDiscoveryCardListResponse, 1), sp().LLILZ);
        this.LLJJJJJIL.LIZ(AFwS256S0000000_18.get$arr$(21));
        this.LLJJJJJIL.LIZLLL(C1697810uHb.LJIIJJI("sync_msg_map_init", "sync_msg_data_change"), new AwS384S0200000_18(this, poiDiscoveryApi$PoiDiscoveryCardListResponse, 20));
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void bq(int i) {
        Animator animator;
        Animator animator2;
        Animator animator3;
        if (i < this.LLJJJ || getContentView().getAlpha() <= 0.0f || ((animator2 = this.LLJJJJ) != null && animator2.isStarted())) {
            if (i <= this.LLJJJ && getContentView().getAlpha() < 1.0f) {
                Animator animator4 = this.LLJJJIL;
                if (animator4 != null && animator4.isStarted()) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                this.LLJJJIL = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
                Animator animator5 = this.LLJJJJ;
                if (animator5 == null || !animator5.isStarted() || (animator = this.LLJJJJ) == null) {
                    return;
                }
                animator.cancel();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getContentView(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.LLJJJJ = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.start();
        Animator animator6 = this.LLJJJIL;
        if (animator6 == null || !animator6.isStarted() || (animator3 = this.LLJJJIL) == null) {
            return;
        }
        animator3.cancel();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.background.map.PoiBackgroundMapAssem for r17v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.background.map.PoiBackgroundMapAssem.onViewCreated(android.view.View):void");
    }

    public final void up(TuxIconView tuxIconView, Integer num) {
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        if (num != null) {
            c419910GdJ.LIZ = num.intValue();
        }
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        tuxIconView.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void tp(PoiDiscoveryCard poiDiscoveryCard, MapModeEnterMethod mapModeEnterMethod, PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse, List<PoiDiscoveryCard> list) {
        C1173300gdc c1173300gdcLJ;
        C1185600gxS c1185600gxS;
        String enterMethod;
        String str;
        String collectInfo;
        String enterFrom;
        String enterMethod2;
        String initialEnterFrom;
        String initialEnterMethod;
        String currentTabCode;
        String initialPoiFromGroupId;
        MapModeType mapModeType$poi_release;
        String str2;
        String fromPoiId;
        String collectInfo2;
        String str3;
        String fromGroupId;
        String enterFrom2;
        String enterMethod3;
        String initialEnterFrom2;
        String initialEnterMethod2;
        String initialPoiFromGroupId2;
        MapModeType mapModeType$poi_release2;
        DynamicMapParams dynamicMapParams;
        PoiMapModeTargetData poiMapModeTargetData;
        String name;
        String currentTabCode2;
        MapBounds dynamicMapWindow;
        String enterFrom3;
        String enterMethod4;
        String initialEnterFrom3;
        String initialEnterMethod3;
        String initialPoiId;
        String fromGroupId2;
        MapModeType mapModeType$poi_release3;
        String collectInfo3;
        Double d;
        Double d2;
        String currentTabCode3;
        Context context = getContext();
        if (context != null && (c1173300gdcLJ = C1174850gg7.LJ(this)) != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null) {
            C1175530ghD c1175530ghD = C1175530ghD.LIZ;
            if (mapModeEnterMethod != null) {
                enterMethod = mapModeEnterMethod.getEnterMethod();
            } else {
                enterMethod = null;
            }
            String str4 = c1185600gxS.LIZ;
            if (poiDiscoveryCard != null) {
                str = poiDiscoveryCard.collectInfo;
            } else {
                str = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponseIp = ip();
            if (poiDetailResponseIp != null) {
                collectInfo = poiDetailResponseIp.getCollectInfo();
            } else {
                collectInfo = null;
            }
            C1185410gx9 c1185410gx9 = c1185600gxS.LJFF;
            if (c1185410gx9 != null) {
                enterFrom = c1185410gx9.getEnterFrom();
            } else {
                enterFrom = null;
            }
            C1185410gx9 c1185410gx92 = c1185600gxS.LJFF;
            if (c1185410gx92 != null) {
                enterMethod2 = c1185410gx92.getEnterMethod();
            } else {
                enterMethod2 = null;
            }
            C1185410gx9 c1185410gx93 = c1185600gxS.LJFF;
            if (c1185410gx93 != null) {
                initialEnterFrom = c1185410gx93.getInitialEnterFrom();
            } else {
                initialEnterFrom = null;
            }
            C1185410gx9 c1185410gx94 = c1185600gxS.LJFF;
            if (c1185410gx94 != null) {
                initialEnterMethod = c1185410gx94.getInitialEnterMethod();
            } else {
                initialEnterMethod = null;
            }
            String str5 = "no_subtab";
            if (poiDiscoveryApi$PoiDiscoveryCardListResponse == null || (currentTabCode = poiDiscoveryApi$PoiDiscoveryCardListResponse.getCurrentTabCode()) == null) {
                currentTabCode = "no_subtab";
            }
            C1185410gx9 c1185410gx95 = c1185600gxS.LJFF;
            if (c1185410gx95 != null) {
                initialPoiFromGroupId = c1185410gx95.getInitialPoiFromGroupId();
            } else {
                initialPoiFromGroupId = null;
            }
            PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse2 = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) C1174850gg7.LIZJ(this);
            if (poiDiscoveryApi$PoiDiscoveryCardListResponse2 == null || (mapModeType$poi_release = poiDiscoveryApi$PoiDiscoveryCardListResponse2.getMapModeType$poi_release()) == null) {
                mapModeType$poi_release = MapModeType.OTHERS;
            }
            C1175530ghD.LIZIZ(c1175530ghD, enterMethod, str4, collectInfo, str, enterFrom, enterMethod2, initialEnterFrom, initialEnterMethod, currentTabCode, initialPoiFromGroupId, PageFinder.via(C724240Sb0.LJI(this)), mapModeType$poi_release, null, C1558520qew.LJIIL(this), 16392);
            C1174730gfv c1174730gfv = C1174730gfv.LIZ;
            if (poiDiscoveryCard != null) {
                str2 = poiDiscoveryCard.poiId;
            } else {
                str2 = null;
            }
            String str6 = c1185600gxS.LIZ;
            C1185410gx9 c1185410gx96 = c1185600gxS.LJFF;
            if (c1185410gx96 != null) {
                fromPoiId = c1185410gx96.getFromPoiId();
            } else {
                fromPoiId = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponseIp2 = ip();
            if (poiDetailResponseIp2 != null) {
                collectInfo2 = poiDetailResponseIp2.getCollectInfo();
            } else {
                collectInfo2 = null;
            }
            if (poiDiscoveryCard != null) {
                str3 = poiDiscoveryCard.collectInfo;
            } else {
                str3 = null;
            }
            C1185410gx9 c1185410gx97 = c1185600gxS.LJFF;
            if (c1185410gx97 != null) {
                fromGroupId = c1185410gx97.getFromGroupId();
            } else {
                fromGroupId = null;
            }
            C1185410gx9 c1185410gx98 = c1185600gxS.LJFF;
            if (c1185410gx98 != null) {
                enterFrom2 = c1185410gx98.getEnterFrom();
            } else {
                enterFrom2 = null;
            }
            C1185410gx9 c1185410gx99 = c1185600gxS.LJFF;
            if (c1185410gx99 != null) {
                enterMethod3 = c1185410gx99.getEnterMethod();
            } else {
                enterMethod3 = null;
            }
            C1185410gx9 c1185410gx910 = c1185600gxS.LJFF;
            if (c1185410gx910 != null) {
                initialEnterFrom2 = c1185410gx910.getInitialEnterFrom();
            } else {
                initialEnterFrom2 = null;
            }
            C1185410gx9 c1185410gx911 = c1185600gxS.LJFF;
            if (c1185410gx911 != null) {
                initialEnterMethod2 = c1185410gx911.getInitialEnterMethod();
            } else {
                initialEnterMethod2 = null;
            }
            C1185410gx9 c1185410gx912 = c1185600gxS.LJFF;
            if (c1185410gx912 != null) {
                initialPoiFromGroupId2 = c1185410gx912.getInitialPoiFromGroupId();
            } else {
                initialPoiFromGroupId2 = null;
            }
            if (poiDiscoveryApi$PoiDiscoveryCardListResponse != null && (currentTabCode3 = poiDiscoveryApi$PoiDiscoveryCardListResponse.getCurrentTabCode()) != null) {
                str5 = currentTabCode3;
            }
            PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse3 = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) C1174850gg7.LIZJ(this);
            if (poiDiscoveryApi$PoiDiscoveryCardListResponse3 == null || (mapModeType$poi_release2 = poiDiscoveryApi$PoiDiscoveryCardListResponse3.getMapModeType$poi_release()) == null) {
                mapModeType$poi_release2 = MapModeType.OTHERS;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
            c1174730gfv.getClass();
            C1174730gfv.LIZJ(pageFinderVia, interfaceC665370Q7zLJIIL, mapModeType$poi_release2, "poi_detail", str2, fromPoiId, fromGroupId, str5, str6, collectInfo2, str3, enterFrom2, enterMethod3, initialEnterFrom2, initialEnterMethod2, initialPoiFromGroupId2, null);
            PoiListApi.PoiDetailResponse poiDetailResponseIp3 = ip();
            if (poiDetailResponseIp3 != null && (dynamicMapParams = poiDetailResponseIp3.getDynamicMapParams()) != null && Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.TRUE)) {
                if (poiDiscoveryCard != null) {
                    String str7 = poiDiscoveryCard.poiId;
                    Location location = poiDiscoveryCard.location;
                    if (location != null) {
                        d = location.lat;
                        d2 = location.lng;
                    } else {
                        d = null;
                        d2 = null;
                    }
                    poiMapModeTargetData = new PoiMapModeTargetData(str7, new PoiLocation(d, d2, null));
                } else {
                    poiMapModeTargetData = null;
                }
                C1175180gge c1175180gge = PoiMapModeFragment.LLJJJ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
                EnumC1175380ggy enumC1175380ggy = EnumC1175380ggy.SCENE_REGION_POI_DETAIL_LANDING;
                String str8 = c1185600gxS.LIZ;
                PoiListApi.PoiDetailResponse poiDetailResponseIp4 = ip();
                if (poiDetailResponseIp4 != null) {
                    name = poiDetailResponseIp4.getName();
                } else {
                    name = null;
                }
                if (poiDiscoveryApi$PoiDiscoveryCardListResponse != null) {
                    currentTabCode2 = poiDiscoveryApi$PoiDiscoveryCardListResponse.getCurrentTabCode();
                    dynamicMapWindow = poiDiscoveryApi$PoiDiscoveryCardListResponse.getDynamicMapWindow();
                } else {
                    currentTabCode2 = null;
                    dynamicMapWindow = null;
                }
                String fromPoiId2 = null;
                String initialPoiFromGroupId3 = null;
                String adClickId = null;
                PoiMapModeDataParams poiMapModeDataParams = new PoiMapModeDataParams(poiMapModeTargetData, null, list, str8, name, currentTabCode2, dynamicMapWindow, null);
                C1185410gx9 c1185410gx913 = c1185600gxS.LJFF;
                if (c1185410gx913 != null) {
                    enterFrom3 = c1185410gx913.getEnterFrom();
                } else {
                    enterFrom3 = null;
                }
                C1185410gx9 c1185410gx914 = c1185600gxS.LJFF;
                if (c1185410gx914 != null) {
                    enterMethod4 = c1185410gx914.getEnterMethod();
                } else {
                    enterMethod4 = null;
                }
                C1185410gx9 c1185410gx915 = c1185600gxS.LJFF;
                if (c1185410gx915 != null) {
                    initialEnterFrom3 = c1185410gx915.getInitialEnterFrom();
                } else {
                    initialEnterFrom3 = null;
                }
                C1185410gx9 c1185410gx916 = c1185600gxS.LJFF;
                if (c1185410gx916 != null) {
                    initialEnterMethod3 = c1185410gx916.getInitialEnterMethod();
                } else {
                    initialEnterMethod3 = null;
                }
                C1185410gx9 c1185410gx917 = c1185600gxS.LJFF;
                if (c1185410gx917 != null) {
                    initialPoiFromGroupId3 = c1185410gx917.getInitialPoiFromGroupId();
                }
                C1185410gx9 c1185410gx918 = c1185600gxS.LJFF;
                if (c1185410gx918 != null) {
                    initialPoiId = c1185410gx918.getInitialPoiId();
                } else {
                    initialPoiId = null;
                }
                C1185410gx9 c1185410gx919 = c1185600gxS.LJFF;
                if (c1185410gx919 != null) {
                    fromGroupId2 = c1185410gx919.getFromGroupId();
                } else {
                    fromGroupId2 = null;
                }
                C1185410gx9 c1185410gx920 = c1185600gxS.LJFF;
                if (c1185410gx920 != null) {
                    fromPoiId2 = c1185410gx920.getFromPoiId();
                }
                C1185410gx9 c1185410gx921 = c1185600gxS.LJFF;
                if (c1185410gx921 != null) {
                    adClickId = c1185410gx921.getAdClickId();
                }
                if (poiDiscoveryApi$PoiDiscoveryCardListResponse == null || (mapModeType$poi_release3 = poiDiscoveryApi$PoiDiscoveryCardListResponse.getMapModeType$poi_release()) == null) {
                    mapModeType$poi_release3 = MapModeType.OTHERS;
                }
                PoiListApi.PoiDetailResponse poiDetailResponseIp5 = ip();
                if (poiDetailResponseIp5 != null) {
                    collectInfo3 = poiDetailResponseIp5.getCollectInfo();
                } else {
                    collectInfo3 = null;
                }
                PoiMapModeMobParams poiMapModeMobParams = new PoiMapModeMobParams(fromGroupId2, fromPoiId2, mapModeEnterMethod, enterFrom3, enterMethod4, initialEnterFrom3, initialEnterMethod3, initialPoiFromGroupId3, initialPoiId, adClickId, mapModeType$poi_release3, collectInfo3, C18JG.LIZ("c79460.d0", PageFinder.via(C724240Sb0.LJI(this)), null), "poi_detail", null);
                c1175180gge.getClass();
                C1175180gge.LIZ(context, interfaceC665370Q7zLJIIL2, enumC1175380ggy, poiMapModeDataParams, poiMapModeMobParams);
            }
        }
    }
}
