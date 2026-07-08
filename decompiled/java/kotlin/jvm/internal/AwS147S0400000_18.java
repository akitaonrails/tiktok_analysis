package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0H4Y;
import X.C0HWO;
import X.C1170860gZg;
import X.C1171750gb7;
import X.C1172510gcL;
import X.C1175600ghK;
import X.C1178440glu;
import X.C1178670gmH;
import X.C1207120hWA;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19514611Wm;
import X.C19EG;
import X.EnumC1178700gmK;
import X.EnumC442280HVy;
import X.InterfaceC1172550gcP;
import X.InterfaceC1207030hW1;
import X.InterfaceC1631630sYr;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.CollaborativeCollectionListContentAssem;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailNavTabAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterKeyCategory;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailNavTabVM;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizToastModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS147S0400000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS147S0400000_18 awS147S0400000_18) {
        String str = ((PoiFeedFilterKeyCategory) awS147S0400000_18.l0).localServiceKeyCategory;
        Integer userCityStatus = ((PoiMapDetailResponse) awS147S0400000_18.l1).getUserCityStatus();
        C1175600ghK.LJIIIIZZ(((PoiMapDetailNavTabAssem) awS147S0400000_18.l3).Ho().LLJ, C1558520qew.LJIIL((UIAssem) awS147S0400000_18.l2), userCityStatus, str);
        PoiMapDetailNavTabVM poiMapDetailNavTabVMGo = ((PoiMapDetailNavTabAssem) awS147S0400000_18.l3).Go();
        poiMapDetailNavTabVMGo.withState(new AwS384S0200000_18((PoiFeedFilterKeyCategory) awS147S0400000_18.l0, poiMapDetailNavTabVMGo, 219));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS147S0400000_18 awS147S0400000_18) {
        boolean z;
        CollaborativeUserInfo collaborativeUserInfo;
        int i;
        CollaborativeUserInfo collaborativeUserInfo2 = ((CollaborativeCollectionListContentAssem) awS147S0400000_18.l0).ip().LLILZIL;
        if (collaborativeUserInfo2 != null && collaborativeUserInfo2.followStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        List listSingletonList = null;
        if (!z) {
            collaborativeUserInfo = null;
        } else {
            collaborativeUserInfo = ((CollaborativeCollectionListContentAssem) awS147S0400000_18.l0).ip().LLILZIL;
        }
        FragmentManager supportFragmentManager = ((C19EG) awS147S0400000_18.l1).getSupportFragmentManager();
        Context context = (Context) awS147S0400000_18.l2;
        if (C1171750gb7.LIZ()) {
            i = 2131847937;
        } else {
            i = 2131834456;
        }
        String string = context.getString(i);
        String string2 = ((Context) awS147S0400000_18.l2).getString(R.string.m6n);
        final CollaborativeCollectionListContentAssem collaborativeCollectionListContentAssem = (CollaborativeCollectionListContentAssem) awS147S0400000_18.l0;
        final InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS147S0400000_18.l3;
        InterfaceC1172550gcP interfaceC1172550gcP = new InterfaceC1172550gcP() { // from class: X.0gZi
            @Override // X.InterfaceC1172550gcP
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1172550gcP
            public final void LIZ(int i2, String str, boolean z2, boolean z3, List list) {
                AbstractC1604130rqV abstractC1604130rqVLp = collaborativeCollectionListContentAssem.lp();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CollaborativeCollectionListContentAssem onInputConfirm s: ");
                sbLIZ.append(str);
                sbLIZ.append(" , status: ");
                sbLIZ.append(i2);
                abstractC1604130rqVLp.LJ(C2188811AlT.LIZIZ(sbLIZ));
                interfaceC1631630sYr.invoke(str, Integer.valueOf(i2), list, Boolean.valueOf(z2));
            }
        };
        if (collaborativeUserInfo != null) {
            listSingletonList = Collections.singletonList(collaborativeUserInfo);
        }
        C1172510gcL.LIZJ(supportFragmentManager, string, null, string2, null, null, interfaceC1172550gcP, null, "chat_settings", "click_chat_setting", listSingletonList, 740);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS147S0400000_18 awS147S0400000_18) {
        String str;
        String str2;
        C0HWO[] c0hwoArr = (C0HWO[]) awS147S0400000_18.l0;
        C013C c013c = (C013C) awS147S0400000_18.l2;
        for (C0HWO c0hwo : c0hwoArr) {
            if (c0hwo.LIZIZ == EnumC442280HVy.DENIED_PERMANENT) {
                c013c.element = true;
            }
        }
        C19514611Wm c19514611Wm = (C19514611Wm) awS147S0400000_18.l1;
        if (c19514611Wm != null) {
            c19514611Wm.LIZJ();
        }
        if (!((C013C) awS147S0400000_18.l2).element) {
            C1207120hWA c1207120hWA = C1207120hWA.LIZ;
            C1207520hWo c1207520hWo = (C1207520hWo) awS147S0400000_18.l3;
            String str3 = null;
            if (c1207520hWo != null) {
                str = c1207520hWo.LIZ;
                str2 = c1207520hWo.LIZIZ;
                str3 = c1207520hWo.LIZLLL;
            } else {
                str = null;
                str2 = null;
            }
            C1207120hWA.LJI(c1207120hWA, str, str2, str3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS147S0400000_18 awS147S0400000_18) {
        String str;
        String str2;
        C0HWO[] c0hwoArr = (C0HWO[]) awS147S0400000_18.l0;
        C013C c013c = (C013C) awS147S0400000_18.l2;
        for (C0HWO c0hwo : c0hwoArr) {
            if (c0hwo.LIZIZ == EnumC442280HVy.DENIED_PERMANENT) {
                c013c.element = true;
            }
        }
        C19514611Wm c19514611Wm = (C19514611Wm) awS147S0400000_18.l1;
        if (c19514611Wm != null) {
            c19514611Wm.LIZJ();
        }
        if (!((C013C) awS147S0400000_18.l2).element) {
            C1207120hWA c1207120hWA = C1207120hWA.LIZ;
            C1207520hWo c1207520hWo = (C1207520hWo) awS147S0400000_18.l3;
            String str3 = null;
            if (c1207520hWo != null) {
                str = c1207520hWo.LIZ;
                str2 = c1207520hWo.LIZIZ;
                str3 = c1207520hWo.LIZLLL;
            } else {
                str = null;
                str2 = null;
            }
            C1207120hWA.LJI(c1207120hWA, str, str2, str3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS147S0400000_18 awS147S0400000_18) {
        ((PoiBackgroundMapComponent) awS147S0400000_18.l0).up(null, MapModeEnterMethod.CLICK_MAP_TOP_DISCOVER, (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) awS147S0400000_18.l1, ((PoiFeedFilterKeyCategory) awS147S0400000_18.l2).localServiceKeyCategory, false);
        String str = ((PoiFeedFilterKeyCategory) awS147S0400000_18.l2).localServiceKeyCategory;
        Integer userCityStatus = ((PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) awS147S0400000_18.l1).getUserCityStatus();
        C1175600ghK.LJIIIIZZ(PageFinder.via((View) awS147S0400000_18.l3), C1558360qeg.LJ((C0H4Y) awS147S0400000_18.l3, null), userCityStatus, str);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS147S0400000_18 awS147S0400000_18) {
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        TokenCert tokenCert = C1178670gmH.LIZ;
        C19EG c19eg = (C19EG) awS147S0400000_18.l0;
        C1207520hWo c1207520hWoLIZ = C1178670gmH.LIZ(EnumC1178700gmK.DURING_QUIZ);
        final C1178440glu c1178440glu = (C1178440glu) awS147S0400000_18.l1;
        final C19EG c19eg2 = (C19EG) awS147S0400000_18.l0;
        final List list = (List) awS147S0400000_18.l2;
        final Function0 function0 = (Function0) awS147S0400000_18.l3;
        c1207450hWh.LJIJJ("poi", "quiz", tokenCert, c19eg, c1207520hWoLIZ, new InterfaceC1207030hW1() { // from class: X.0gmD
            @Override // X.InterfaceC1207030hW1
            public final void LIZ() {
                c1178440glu.LIZ();
                function0.invoke();
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZJ(int i) {
                c1178440glu.LJ(c19eg2, list, EnumC1178460glw.REQUEST_GPS_IN_QUIZ, function0);
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZIZ(int i, String str) {
                c1178440glu.LJ(c19eg2, list, EnumC1178460glw.REQUEST_GPS_IN_QUIZ, function0);
            }
        }, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS147S0400000_18(C19EG c19eg, C19EG c19eg2, C1178440glu c1178440glu, List<PoiQuizToastModel> list, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = c1178440glu;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0400000_18(CollaborativeCollectionListContentAssem collaborativeCollectionListContentAssem, C19EG c19eg, Context context, C1170860gZg c1170860gZg, int i) {
        super(0);
        this.$t = i;
        this.l0 = collaborativeCollectionListContentAssem;
        this.l1 = c19eg;
        this.l2 = context;
        this.l3 = c1170860gZg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0400000_18(PoiBackgroundMapComponent poiBackgroundMapComponent, PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2, PoiFeedFilterKeyCategory poiFeedFilterKeyCategory, C0H4Y c0h4y, int i) {
        super(0);
        this.$t = i;
        this.l0 = poiBackgroundMapComponent;
        this.l1 = poiDiscoveryApi$PoiDiscoveryCardListResponseV2;
        this.l2 = poiFeedFilterKeyCategory;
        this.l3 = c0h4y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0400000_18(PoiFeedFilterKeyCategory poiFeedFilterKeyCategory, PoiMapDetailResponse poiMapDetailResponse, UIAssem uIAssem, PoiMapDetailNavTabAssem poiMapDetailNavTabAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = poiFeedFilterKeyCategory;
        this.l1 = poiMapDetailResponse;
        this.l2 = uIAssem;
        this.l3 = poiMapDetailNavTabAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0400000_18(C0HWO[] c0hwoArr, C19514611Wm c19514611Wm, C013C c013c, C1207520hWo c1207520hWo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0hwoArr;
        this.l1 = c19514611Wm;
        this.l2 = c013c;
        this.l3 = c1207520hWo;
    }
}
