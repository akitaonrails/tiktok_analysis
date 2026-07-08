package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.AbstractC683590Qrd;
import X.C019F;
import X.C01GW;
import X.C1170820gZc;
import X.C1171600gas;
import X.C1171620gau;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C294880Bh8;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS84S0300000_18;
import Y.AfS175S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeUser;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionListChooseAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectionListChooseAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CollectionListChooseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 190), AFwS256S0000000_18.get$arr$(96), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 287));
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1171600gas.class, null), checkSupervisorPrepared());
        this.LLJIJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(320));
    }

    public final C1171600gas Go() {
        return (C1171600gas) this.LLJI.getValue();
    }

    public final VideoCollectionListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (VideoCollectionListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0QrV, X.0gau, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        RecyclerView recyclerView = (RecyclerView) view;
        ?? r2 = new AbstractC683590Qrd<C1170820gZc>() { // from class: X.0gau
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

            @Override // X.AbstractC438050HFr
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Exception {
                C1170820gZc c1170820gZc;
                CollectionDetail.Status status;
                Integer num;
                long jLongValue;
                UrlModel urlModel;
                List<String> urlList;
                String str;
                CollaborativeUser collaborativeUser;
                CollaborativeUser collaborativeUser2;
                Context context;
                boolean z2;
                Long l;
                TuxIconView tuxIconView;
                Integer num2;
                List<C1170820gZc> data = getData();
                if (data != null && (c1170820gZc = (C1170820gZc) C13LP.LJJJLZIJ(i, data)) != null) {
                    if (viewHolder instanceof C1171650gax) {
                        C1171650gax c1171650gax = (C1171650gax) viewHolder;
                        C786410Ut5.I7(new ACListenerS121S0200000_18(c1171650gax.LL, c1171650gax, 7), c1171650gax.itemView);
                        return;
                    }
                    if (viewHolder instanceof C1171630gav) {
                        C1171630gav c1171630gav = (C1171630gav) viewHolder;
                        CollectionDetail collectionDetail = c1170820gZc.LIZ;
                        c1171630gav.LLILZIL = collectionDetail;
                        c1171630gav.LLILZLL = i;
                        c1171630gav.LL.setText(collectionDetail.name);
                        boolean zLIZ = C1171750gb7.LIZ();
                        CollectionDetail.Status status2 = collectionDetail.status;
                        if (((status2 != null && (num2 = status2.state) != null && 1 == num2.intValue()) || ((status = collectionDetail.status) != null && (num = status.state) != null && 5 == num.intValue())) && (tuxIconView = (TuxIconView) c1171630gav.itemView.findViewById(R.id.noy)) != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                        }
                        int i2 = 4;
                        C1378990lzN.LIZIZ(c1171630gav.LLILLJJLI, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
                        TextView textView = c1171630gav.LL;
                        if (!C444960Hcc.LIZJ(c1171630gav.LLIZ.getContext())) {
                            i2 = 3;
                        }
                        textView.setTextDirection(i2);
                        CollectionDetail.Statistic statistic = collectionDetail.statistic;
                        if (statistic != null && (l = statistic.total) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        TuxTextView tuxTextView = c1171630gav.LLILLL;
                        tuxTextView.setText(tuxTextView.getContext().getResources().getQuantityString(2131755705, (int) jLongValue, String.valueOf(jLongValue)));
                        if (zLIZ) {
                            tuxTextView.setTextColorRes(R.attr.a1k);
                            tuxTextView.setTuxFont(51);
                        }
                        Integer num3 = collectionDetail.type;
                        String str2 = "";
                        if (num3 != null && num3.intValue() == 1) {
                            C12ES.LJIILL(0, c1171630gav.LLILZ);
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ("");
                            c1331670kl3LJIIIZ.LJJ(c1171630gav.LLILLJJLI);
                            C786410Ut5.h3(c1331670kl3LJIIIZ);
                            if (!C1336205Ku.LIZJ().LIZJ() && !C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (C1171750gb7.LIZIZ(z2)) {
                                ViewGroup.LayoutParams layoutParams = c1171630gav.LLILZ.getLayoutParams();
                                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                                TuxIconView tuxIconView2 = c1171630gav.LLILZ;
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_map_thumbtack_fill;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                                tuxIconView2.setTuxIcon(c419910GdJ);
                            }
                        } else {
                            C1206770hVb.LIZ(c1171630gav.LLILZ);
                            List<UrlModel> list = collectionDetail.covers;
                            if (list != null && (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, list)) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                                str2 = str;
                            }
                            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str2);
                            c1331670kl3LJIIIZ2.LJJ(c1171630gav.LLILLJJLI);
                            C786410Ut5.h3(c1331670kl3LJIIIZ2);
                        }
                        C786410Ut5.I7(new ACListenerS84S0300000_18(collectionDetail, c1171630gav.LLIZ, c1171630gav, 0), c1171630gav.itemView);
                        if (zLIZ) {
                            List<CollaborativeUser> list2 = collectionDetail.collaborativeUserList;
                            if (list2 != null && (!list2.isEmpty()) && (collaborativeUser = (CollaborativeUser) C13LP.LJJJLZIJ(0, list2)) != null && collaborativeUser.name != null && (collaborativeUser2 = (CollaborativeUser) C13LP.LJJJLZIJ(0, list2)) != null && collaborativeUser2.avatarThumb != null && (context = c1171630gav.LLIZ.getContext()) != null) {
                                C786410Ut5.LLLLZLL((TuxTextView) c1171630gav.itemView.findViewById(R.id.videos_dot), 0);
                                C786410Ut5.LLLLLLZZ((TuxIconView) c1171630gav.itemView.findViewById(R.id.e5t), 0);
                                ArrayList arrayList = new ArrayList();
                                Iterator<CollaborativeUser> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    UrlModel urlModel2 = it2.next().avatarThumb;
                                    if (urlModel2 != null) {
                                        arrayList.add(urlModel2);
                                    }
                                }
                                if (new C2177241AIw(context, new C1246110iX3(arrayList, arrayList.size()), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), Integer.valueOf(R.attr.zi), 0, 0, 0.0f, 0.0f, 0, 0, null, null, false, false, false, null, 131064)).LIZLLL().LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS175S0100000_6(c1171630gav, 6)) != null) {
                                    return;
                                }
                            }
                            C786410Ut5.LLLLLLZZ((TuxIconView) c1171630gav.itemView.findViewById(R.id.e5t), 8);
                            C786410Ut5.LLLLZLL((TuxTextView) c1171630gav.itemView.findViewById(R.id.videos_dot), 8);
                            return;
                        }
                        return;
                    }
                    throw new Exception("not match view type");
                }
            }

            @Override // X.AbstractC438050HFr
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) throws Exception {
                if (i == 0) {
                    return new C1171650gax(this.LL, viewGroup);
                }
                if (i == 2) {
                    return new C1171630gav(this.LL, viewGroup);
                }
                throw new Exception("not match view type");
            }
        };
        r2.setLoadMoreListener(new AwS419S0200000_18((C1171620gau) r2, this, 26));
        if (C294880Bh8.LIZ()) {
            recyclerView.setOverScrollMode(2);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(r2);
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0gar
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160250gIZ) obj).LL;
            }
        }, null, new AwS597S0100000_18(recyclerView, 93), new AwS419S0200000_18(recyclerView, (C1171620gau) r2, 25), new AwS384S0200000_18(recyclerView, (C1171620gau) r2, 48), 2, null);
        VideoCollectionListViewModel videoCollectionListViewModelHo = Ho();
        String str = Go().LLILLJJLI;
        boolean z2 = Go().LLILLL;
        boolean z3 = Go().LLILZ;
        if (Go().LLILZIL != null) {
            z = true;
        } else {
            z = false;
        }
        videoCollectionListViewModelHo.vQ2(str, true, z2, z3, z);
    }
}
