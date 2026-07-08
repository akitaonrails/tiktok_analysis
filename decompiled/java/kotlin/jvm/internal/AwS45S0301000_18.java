package kotlin.jvm.internal;

import X.AbstractC316870CbV;
import X.C09AY;
import X.C1164120gOo;
import X.C1166800gT8;
import X.C1194140hBE;
import X.C1322110kVd;
import X.C13BV;
import X.C15438062q;
import X.C189200o6;
import X.C20248814Kw;
import X.C291001Au;
import X.C316640Cb8;
import X.C317290CcB;
import X.C323380Cm0;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS45S0301000_18 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$0(AwS45S0301000_18 awS45S0301000_18, Object obj) {
        ?? arrayList;
        C1164120gOo c1164120gOo = (C1164120gOo) obj;
        List<Aweme> list = c1164120gOo.LL;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAid());
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List list2 = (List) awS45S0301000_18.l0;
        List list3 = (List) awS45S0301000_18.l1;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            if (!arrayList.contains(((Aweme) obj2).getAid())) {
                arrayList2.add(obj2);
            }
        }
        list2.addAll(arrayList2);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS45S0301000_18.l2;
        List<Aweme> list4 = c1164120gOo.LL;
        List list5 = (List) awS45S0301000_18.l0;
        mixVideosViewModel.getClass();
        return C1164120gOo.LIZ(c1164120gOo, MixVideosViewModel.vQ2(list4, list5), null, null, awS45S0301000_18.i3, false, 0, null, null, null, 1014);
    }

    public static final Object invoke$1(AwS45S0301000_18 awS45S0301000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((PoiActivityApi.PoiBannerInfo) awS45S0301000_18.l0, 2465);
        C1194140hBE c1194140hBE = (C1194140hBE) awS45S0301000_18.l1;
        PoiActivityApi.PoiBannerInfo poiBannerInfo = (PoiActivityApi.PoiBannerInfo) awS45S0301000_18.l0;
        c20248814Kw.LIZIZ(new AwS60S0301000_18(awS45S0301000_18.i3, (C1322110kVd) awS45S0301000_18.l2, poiBannerInfo, c1194140hBE, 1));
        C20248814Kw.LIZJ(c20248814Kw, false, false, 0.5f, 0, null, null, null, 123);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$2(AwS45S0301000_18 awS45S0301000_18, Object obj) {
        ?? arrayList;
        C1164120gOo c1164120gOo = (C1164120gOo) obj;
        List<Aweme> list = c1164120gOo.LL;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAid());
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List list2 = (List) awS45S0301000_18.l0;
        List list3 = (List) awS45S0301000_18.l1;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            if (!arrayList.contains(((Aweme) obj2).getAid())) {
                arrayList2.add(obj2);
            }
        }
        list2.addAll(arrayList2);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS45S0301000_18.l2;
        List list4 = (List) awS45S0301000_18.l0;
        List<Aweme> list5 = c1164120gOo.LL;
        mixVideosViewModel.getClass();
        return C1164120gOo.LIZ(c1164120gOo, MixVideosViewModel.vQ2(list4, list5), null, null, awS45S0301000_18.i3, false, 0, null, null, new C291001Au(Boolean.TRUE), 502);
    }

    public static final Object invoke$3(AwS45S0301000_18 awS45S0301000_18, Object obj) {
        List<? extends Aweme> list = ((MixVideosResponse) awS45S0301000_18.l0).mixVideos;
        ArrayList arrayList = new ArrayList();
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS45S0301000_18.l1;
        MixVideosResponse mixVideosResponse = (MixVideosResponse) awS45S0301000_18.l0;
        mixVideosViewModel.LLJI = mixVideosResponse.minCursor;
        mixVideosViewModel.LLIZLLLIL = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AwS45S0301000_18((List) arrayList, (List<Aweme>) list, (List<? extends Aweme>) mixVideosViewModel, (MixVideosViewModel) awS45S0301000_18.i3, 2));
        }
        if (((MixVideosViewModel) awS45S0301000_18.l1).LLIZLLLIL) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS45S0301000_18.l2;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Long lValueOf = Long.valueOf(((MixVideosResponse) awS45S0301000_18.l0).minCursor);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C1166800gT8((Aweme) it2.next(), null));
            }
            C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(c317290CcB, lValueOf, null, arrayList2, 2);
            C189200o6.m2constructorimpl(c323380Cm0LJ);
            interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS45S0301000_18.l2;
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new C1166800gT8((Aweme) it3.next(), null));
            }
            c317290CcB2.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(arrayList3);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS45S0301000_18 awS45S0301000_18, Object obj) {
        MixVideosResponse mixVideosResponse = (MixVideosResponse) awS45S0301000_18.l0;
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS45S0301000_18.l1;
        mixVideosViewModel.LLJIJIL = mixVideosResponse.maxCursor;
        mixVideosViewModel.LLJ = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AwS102S0201000_18(mixVideosViewModel, (MixVideosViewModel) list, (List<? extends Aweme>) awS45S0301000_18.i3, 4));
        }
        MixVideosResponse mixVideosResponse2 = (MixVideosResponse) awS45S0301000_18.l0;
        List<? extends Aweme> list2 = mixVideosResponse2.mixVideos;
        if (((MixVideosViewModel) awS45S0301000_18.l1).LLJ) {
            if (list2 != null) {
                InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS45S0301000_18.l2;
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Long lValueOf = Long.valueOf(mixVideosResponse2.maxCursor);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<? extends Aweme> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C1166800gT8(it2.next(), null));
                }
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(c317290CcB, null, lValueOf, arrayList, 1);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
            }
        } else if (list2 != null) {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS45S0301000_18.l2;
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<? extends Aweme> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new C1166800gT8(it3.next(), null));
            }
            c317290CcB2.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(arrayList2);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$5(AwS45S0301000_18 awS45S0301000_18, Object obj) {
        ?? arrayList;
        C1164120gOo c1164120gOo = (C1164120gOo) obj;
        List<Aweme> list = c1164120gOo.LL;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAid());
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List list2 = (List) awS45S0301000_18.l0;
        List list3 = (List) awS45S0301000_18.l1;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            if (!arrayList.contains(((Aweme) obj2).getAid())) {
                arrayList2.add(obj2);
            }
        }
        list2.addAll(arrayList2);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS45S0301000_18.l2;
        List list4 = (List) awS45S0301000_18.l0;
        List<Aweme> list5 = c1164120gOo.LL;
        mixVideosViewModel.getClass();
        return C1164120gOo.LIZ(c1164120gOo, MixVideosViewModel.vQ2(list4, list5), null, null, awS45S0301000_18.i3, false, 0, null, null, null, 1014);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS45S0301000_18(int r3, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse r4, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel r5, X.InterfaceC1364105Vn r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 3 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.i3 = r3
            r1.l2 = r6
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r6
            r1.i3 = r3
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS45S0301000_18.<init>(int, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel, X.05Vn, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0301000_18(int i, C1322110kVd c1322110kVd, PoiActivityApi.PoiBannerInfo poiBannerInfo, C1194140hBE c1194140hBE, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = poiBannerInfo;
        this.l1 = c1194140hBE;
        this.l2 = c1322110kVd;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0301000_18(List list, List<Aweme> list2, List<? extends Aweme> list3, MixVideosViewModel mixVideosViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.i3 = mixVideosViewModel;
    }
}
