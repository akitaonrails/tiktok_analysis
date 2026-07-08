package kotlin.jvm.internal;

import X.C09AY;
import X.C1160290gId;
import X.C1577330r9H;
import X.C1577750r9x;
import X.C1577840rA6;
import X.C1577850rA7;
import X.C1581520rG2;
import X.C1597310rfV;
import X.C1611550s2T;
import X.C1612480s3y;
import X.C19EH;
import X.C2344009Gk;
import X.C259800zU;
import X.InterfaceC1160280gIc;
import X.InterfaceC1578650rBP;
import X.InterfaceC1891350zJl;
import X.InterfaceC714040Rze;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.impl.SeriesLimitedFreeServiceImpl;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.minidrama.common.component.service.MiniDramaLimitedFreePopUpConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS119S0400000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS119S0400000_24 awS119S0400000_24, Object obj) {
        InterfaceC714040Rze interfaceC714040Rze = (InterfaceC714040Rze) obj;
        ISkylightMafService iSkylightMafService = (ISkylightMafService) awS119S0400000_24.l0;
        boolean z = true;
        if (iSkylightMafService != null && iSkylightMafService.LIZLLL(interfaceC714040Rze.getStoryCollection().getAuthor())) {
            String strLIZIZ = ((C1597310rfV) awS119S0400000_24.l1).LIZIZ((InterfaceC1891350zJl) interfaceC714040Rze);
            if (!((Set) awS119S0400000_24.l2).contains(strLIZIZ)) {
                ((List) awS119S0400000_24.l3).add(new C1160290gId(strLIZIZ));
                ((Set) awS119S0400000_24.l2).add(strLIZIZ);
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS119S0400000_24 awS119S0400000_24, Object obj) {
        Function0<FragmentManager> function0;
        FragmentManager fragmentManagerInvoke;
        Bitmap bitmap = (Bitmap) obj;
        C1577750r9x c1577750r9x = ((BaseSeriesTopTabVM) awS119S0400000_24.l0).LLILZLL;
        if (c1577750r9x != null && (function0 = c1577750r9x.LIZIZ) != null && (fragmentManagerInvoke = function0.invoke()) != null) {
            BaseSeriesTopTabVM baseSeriesTopTabVM = (BaseSeriesTopTabVM) awS119S0400000_24.l0;
            ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) awS119S0400000_24.l1;
            MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig = (MiniDramaLimitedFreePopUpConfig) awS119S0400000_24.l2;
            Function0 function02 = (Function0) awS119S0400000_24.l3;
            baseSeriesTopTabVM.GQ2(true);
            C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
            String enterFrom = baseSeriesTopTabVM.getEnterFrom();
            c1581520rG2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1612480s3y.LJIIL(c2344009Gk, enterFrom, false);
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("series_limited_free_popup_show", c2344009Gk.LIZ);
            }
            C1577750r9x c1577750r9x2 = baseSeriesTopTabVM.LLILZLL;
            if (c1577750r9x2 != null) {
                int i = c1577750r9x2.LIZ;
                baseSeriesTopTabVM.getEnterFrom();
                iSeriesLimitedFreeService.LJ(fragmentManagerInvoke, i, new C1577840rA6(bitmap), miniDramaLimitedFreePopUpConfig, new AwS390S0200000_24(baseSeriesTopTabVM, (BaseSeriesTopTabVM<C1577850rA7>) function02, (Function0<Unit>) 15), function02);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS119S0400000_24 awS119S0400000_24, Object obj) {
        AwS152S0400000_24 awS152S0400000_24 = new AwS152S0400000_24((DramaDNUFeedCardConfig) obj, (Context) awS119S0400000_24.l1, (Aweme) awS119S0400000_24.l2, (HomeViewPagerAbility) awS119S0400000_24.l3, 1);
        C1577330r9H c1577330r9H = (C1577330r9H) awS119S0400000_24.l0;
        if (c1577330r9H.LIZ) {
            awS152S0400000_24.invoke();
        } else {
            c1577330r9H.LIZIZ = awS152S0400000_24;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS119S0400000_24 awS119S0400000_24, Object obj) {
        Fragment fragment = (Fragment) ((C259800zU) awS119S0400000_24.l0).element;
        if (fragment != null) {
            C19EH c19ehLJIIJ = ((FragmentManager) awS119S0400000_24.l3).LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIJ();
        }
        Function1 function1 = (Function1) awS119S0400000_24.l1;
        if (function1 != null) {
            function1.invoke(obj);
        }
        ((SeriesLimitedFreeServiceImpl) awS119S0400000_24.l2).getClass();
        Iterator<InterfaceC1578650rBP> it2 = ((SeriesLimitedFreeServiceImpl) awS119S0400000_24.l2).LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0400000_24(C259800zU c259800zU, AwS390S0200000_24 awS390S0200000_24, SeriesLimitedFreeServiceImpl seriesLimitedFreeServiceImpl, FragmentManager fragmentManager, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = awS390S0200000_24;
        this.l2 = seriesLimitedFreeServiceImpl;
        this.l3 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0400000_24(C1577330r9H c1577330r9H, Context context, Aweme aweme, HomeViewPagerAbility homeViewPagerAbility, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1577330r9H;
        this.l1 = context;
        this.l2 = aweme;
        this.l3 = homeViewPagerAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0400000_24(BaseSeriesTopTabVM baseSeriesTopTabVM, ISeriesLimitedFreeService iSeriesLimitedFreeService, MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig, AwS425S0200000_24 awS425S0200000_24, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseSeriesTopTabVM;
        this.l1 = iSeriesLimitedFreeService;
        this.l2 = miniDramaLimitedFreePopUpConfig;
        this.l3 = awS425S0200000_24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS119S0400000_24(ISkylightMafService iSkylightMafService, ISkylightMafService iSkylightMafService2, C1597310rfV c1597310rfV, Set<String> set, List<InterfaceC1160280gIc<InterfaceC1891350zJl>> list) {
        super(1);
        this.$t = list;
        this.l0 = iSkylightMafService;
        this.l1 = iSkylightMafService2;
        this.l2 = c1597310rfV;
        this.l3 = set;
    }
}
