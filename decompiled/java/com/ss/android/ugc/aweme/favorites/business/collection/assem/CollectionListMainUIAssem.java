package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.AbstractC21673619ry;
import X.AbstractC683590Qrd;
import X.C019F;
import X.C01GW;
import X.C0HI1;
import X.C1170740gZU;
import X.C1170820gZc;
import X.C1171240gaI;
import X.C1171750gb7;
import X.C1206780hVc;
import X.C1208640hYc;
import X.C13LE;
import X.C1458960o4M;
import X.C14EU;
import X.C1637806bA;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C20593115i5;
import X.C20684815ws;
import X.C2217381BqS;
import X.C295040BhO;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C622680Oba;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionListMainUIAssem extends UIContentAssem implements InterfaceC487330J9f {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final Map<String, CollectionContentResponse> LLJIJIL;
    public final Map<String, CollectionDetail> LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectionListMainUIAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CollectionListMainUIAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 191), AFwS256S0000000_18.get$arr$(97), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 288));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 289));
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = new LinkedHashMap();
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(127));
    }

    public final VideoCollectionListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (VideoCollectionListViewModel) assemVMLazy.getValue();
    }

    public final int Ho() {
        C20593115i5.LIZ.getClass();
        int i = 2;
        if (C20593115i5.LJIILIIL() && C295040BhO.LIZ() && Intrinsics.LJFF(Go().LLILLL, "personal_homepage")) {
            return 2;
        }
        if (C295040BhO.LIZ() && Intrinsics.LJFF(Go().LLILLL, "personal_homepage")) {
            i = 1;
        }
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(i, 0);
    }

    public final boolean Lo() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        C487280J9a.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVideoCollectionDetailFetchEvent(C0HI1 c0hi1) {
        RecyclerView recyclerView;
        AbstractC683590Qrd abstractC683590Qrd;
        List data;
        Object next;
        Integer num;
        Integer num2;
        Long l;
        String str = c0hi1.LIZ.id;
        if (str == null) {
            return;
        }
        View viewLJJIJL = LJJIJL();
        Long l2 = null;
        if ((viewLJJIJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJIJL) != null) {
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C1171240gaI) || (abstractC683590Qrd = (AbstractC683590Qrd) adapter) == null || (data = abstractC683590Qrd.getData()) == null) {
                return;
            }
            Iterator it2 = data.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1170820gZc) next).LIZ.id, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1170820gZc c1170820gZc = (C1170820gZc) next;
            if (c1170820gZc == null) {
                return;
            }
            c1170820gZc.LIZ = c0hi1.LIZ;
            CollectionDetail collectionDetail = (CollectionDetail) ((LinkedHashMap) this.LLJILJIL).get(str);
            if (collectionDetail != null && this.LLJIJIL.containsKey(str)) {
                if (Intrinsics.LJFF(collectionDetail.name, c0hi1.LIZ.name)) {
                    CollectionDetail.Status status = collectionDetail.status;
                    if (status != null) {
                        num = status.state;
                    } else {
                        num = null;
                    }
                    CollectionDetail.Status status2 = c0hi1.LIZ.status;
                    if (status2 != null) {
                        num2 = status2.state;
                    } else {
                        num2 = null;
                    }
                    if (Intrinsics.LJFF(num, num2)) {
                        CollectionDetail.Statistic statistic = collectionDetail.statistic;
                        if (statistic != null) {
                            l = statistic.total;
                        } else {
                            l = null;
                        }
                        CollectionDetail.Statistic statistic2 = c0hi1.LIZ.statistic;
                        if (statistic2 != null) {
                            l2 = statistic2.total;
                        }
                        if (Intrinsics.LJFF(l, l2)) {
                            return;
                        }
                    }
                }
                this.LLJIJIL.remove(str);
                this.LLJILJIL.put(str, c0hi1.LIZ);
                abstractC683590Qrd.notifyItemChanged(data.indexOf(c1170820gZc));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0QrV, X.0gaI, X.19ry, java.lang.Object] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        if (C295040BhO.LIZ() && Lo()) {
            C426750GoL.LJIIL(recyclerView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, 26);
        } else {
            C426750GoL.LJIIL(recyclerView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, 26);
        }
        ?? r1 = new AbstractC683590Qrd<C1170820gZc>() { // from class: X.0gaI
            {
                super(false);
            }

            @Override // X.AbstractC438050HFr
            public final int getBasicItemViewType(int i) {
                C1170820gZc c1170820gZc;
                List<C1170820gZc> data = getData();
                if (data != null && (c1170820gZc = (C1170820gZc) C13LP.LJJJLZIJ(i, data)) != null) {
                    return c1170820gZc.LIZIZ;
                }
                return 2;
            }

            @Override // X.AbstractC21673619ry
            public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                super.onViewRecycled(viewHolder);
                if (viewHolder instanceof C1171250gaJ) {
                    C1171250gaJ c1171250gaJ = (C1171250gaJ) viewHolder;
                    C11JF c11jf = c1171250gaJ.LLJIJIL;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    c1171250gaJ.LLJI = null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:195:0x0553  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01fc  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x0290  */
            @Override // X.AbstractC438050HFr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r43, int r44) throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 1613
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1171240gaI.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            @Override // X.AbstractC438050HFr
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) throws Exception {
                if (i == 0) {
                    return new C1170790gZZ(this.LL, viewGroup);
                }
                if (i == 2) {
                    if (C295040BhO.LIZ() && Intrinsics.LJFF(this.LL.Go().LLILLL, "personal_homepage")) {
                        return new C1171250gaJ(this.LL, viewGroup);
                    }
                    return new C1171260gaK(this.LL, viewGroup);
                }
                throw new Exception("not match view type");
            }
        };
        r1.setLoadMoreListener(new AwS419S0200000_18((C1171240gaI) r1, this, 28));
        r1.spanSizeLookup = new C1208640hYc(r1, this, 1);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), Ho()));
        recyclerView.setAdapter(r1);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gZb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160250gIZ) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(recyclerView, 38), 4);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0gZA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160250gIZ) obj).LL;
            }
        }, null, new AwS597S0100000_18(recyclerView, 94), new AwS419S0200000_18(recyclerView, (C1171240gaI) r1, 27), new AwS227S0300000_18((C1171240gaI) r1, recyclerView, this, 18), 2, null);
        C622680Oba.LIZJ(this);
        C487280J9a.LIZ(-hashCode(), this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void updateVideoCollectionPrivacy(C1170740gZU c1170740gZU) {
        RecyclerView recyclerView;
        AbstractC683590Qrd abstractC683590Qrd;
        int iIndexOf;
        CollectionDetail collectionDetail;
        CollectionDetail.Status status;
        int i;
        View viewLJJIJL = LJJIJL();
        C1170820gZc c1170820gZc = null;
        Object obj = null;
        if ((viewLJJIJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJIJL) != null) {
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if ((adapter instanceof C1171240gaI) && (abstractC683590Qrd = (AbstractC683590Qrd) adapter) != null) {
                List data = abstractC683590Qrd.getData();
                if (data != null) {
                    Iterator it2 = data.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (Intrinsics.LJFF(((C1170820gZc) next).LIZ.id, c1170740gZU.LIZ)) {
                            obj = next;
                            break;
                        }
                    }
                    c1170820gZc = (C1170820gZc) obj;
                    if (c1170820gZc != null && (collectionDetail = c1170820gZc.LIZ) != null && (status = collectionDetail.status) != null) {
                        if (c1170740gZU.LIZIZ) {
                            i = 3;
                        } else {
                            i = 1;
                        }
                        status.state = i;
                    }
                }
                List data2 = abstractC683590Qrd.getData();
                if (data2 != null) {
                    iIndexOf = data2.indexOf(c1170820gZc);
                } else {
                    iIndexOf = 0;
                }
                abstractC683590Qrd.notifyItemChanged(iIndexOf);
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        GridLayoutManager gridLayoutManager;
        RecyclerView recyclerView;
        View viewLJJIJL = LJJIJL();
        RecyclerView.LayoutManager layoutManager = null;
        if ((viewLJJIJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJIJL) != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJ(Ho());
        }
    }

    public final void Jo(CollectionDetail collectionDetail, int i, int i2, String str, Map<String, String> map) {
        Integer num;
        long jLongValue;
        Long l;
        C1206780hVc.LIZ("click collection");
        String str2 = Go().LLILZ;
        if (str2 != null) {
            map.put("favourite_enter_method", str2);
        }
        C20684815ws.LJIILLIIL("click_collection", map);
        C1458960o4M.LIZ = true;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//favorite/videos/collections/content");
        smartRouteBuildRoute.withParam("name", collectionDetail.name);
        smartRouteBuildRoute.withParam("collectionCount", i);
        smartRouteBuildRoute.withParam("collection_id", collectionDetail.id);
        smartRouteBuildRoute.withParam("favourite_enter_method", Go().LLILZ);
        smartRouteBuildRoute.withParam("enter_from", Go().LLILLL);
        CollectionDetail.Status status = collectionDetail.status;
        if (status != null) {
            num = status.state;
        } else {
            num = null;
        }
        smartRouteBuildRoute.withParam("state", num);
        CollectionDetail.Statistic statistic = collectionDetail.statistic;
        if (statistic != null && (l = statistic.total) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        smartRouteBuildRoute.withParam("total", jLongValue);
        smartRouteBuildRoute.withParam("uid", Go().LL);
        smartRouteBuildRoute.withParam("creator_name", collectionDetail.creatorName);
        smartRouteBuildRoute.withParam("index", i2);
        if (C1171750gb7.LIZ()) {
            smartRouteBuildRoute.withParam("cover_url", str);
        }
        if (Intrinsics.LJFF(Go().LLILLL, "chat_detail") || Intrinsics.LJFF(Go().LLILLL, "chat_settings")) {
            smartRouteBuildRoute.withParam("enter_type", "click_chat_setting");
        }
        smartRouteBuildRoute.open();
    }
}
