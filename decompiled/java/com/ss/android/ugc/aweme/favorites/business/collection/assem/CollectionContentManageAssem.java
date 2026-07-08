package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C01GW;
import X.C1170970gZr;
import X.C1171150ga9;
import X.C1171170gaB;
import X.C1171200gaE;
import X.C1171750gb7;
import X.C1172040gba;
import X.C1172580gcS;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1171190gaD;
import X.InterfaceC1172050gbb;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeUser;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import wh6.AbS508S0200000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionContentManageAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, CollectionDetail.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1170970gZr.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectionContentManageAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionContentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CollectionContentManageAssem() {
        C019F c019f = C019F.LIZ;
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 278);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionContentViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 286), AFwS256S0000000_18.get$arr$(95), awS562S0100000_18, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 279));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 285));
    }

    public final C1170970gZr Ho() {
        return (C1170970gZr) this.LLJ.getValue();
    }

    public final VideoCollectionContentViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (VideoCollectionContentViewModel) assemVMLazy.getValue();
    }

    public final InterfaceC1171190gaD Lo() {
        return (InterfaceC1171190gaD) this.LLJIJIL.getValue();
    }

    public final CollectionDetail No() {
        return (CollectionDetail) this.LLIZLLLIL.getValue();
    }

    public final void Go(final C19EG c19eg) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        Pair[] pairArr = new Pair[3];
        C1170970gZr c1170970gZrHo = Ho();
        Integer num2 = null;
        if (c1170970gZrHo != null) {
            str = c1170970gZrHo.LLILLL;
        } else {
            str = null;
        }
        pairArr[0] = new Pair(str, "enter_from");
        pairArr[1] = new Pair(No().id, "collection_id");
        CollectionDetail.Status status = No().status;
        if (status != null) {
            num2 = status.state;
        }
        pairArr[2] = new Pair(C1172580gcS.LIZ(num2), "collection_type");
        C20684815ws.LJIJI("collection_manage_videos", pairArr);
        List<CollaborativeUser> list = No().collaborativeUserList;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        CollectionDetail.Status status2 = No().status;
        if (status2 != null && (num = status2.state) != null && num.intValue() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        Integer num3 = No().type;
        if (num3 != null && num3.intValue() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1172040gba.LIZ(c19eg, this.LLJILJILJ, z, z3, z2, new InterfaceC1172050gbb() { // from class: X.0gaA
            @Override // X.InterfaceC1172050gbb
            public final void LIZIZ() {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://favorite/videos/collections/add/video");
                smartRouteBuildRoute.withParam("collectionId", this.No().id);
                smartRouteBuildRoute.withParam("collectionName", this.No().name);
                smartRouteBuildRoute.withParam("collectionType", this.No().type);
                smartRouteBuildRoute.withParam("enterMethod", "click_add_videos");
                C1170970gZr c1170970gZrHo2 = this.Ho();
                String[] strArr = null;
                smartRouteBuildRoute.withParam("enter_from", c1170970gZrHo2 != null ? c1170970gZrHo2.LLILLL : null);
                CollectionDetail.Status status3 = this.No().status;
                smartRouteBuildRoute.withParam("collection_status", status3 != null ? status3.state : null);
                List<CollaborativeUser> list2 = this.No().collaborativeUserList;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<CollaborativeUser> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String str2 = it2.next().uid;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                }
                smartRouteBuildRoute.withParam("collaborative_uid", strArr);
                smartRouteBuildRoute.open();
            }

            @Override // X.InterfaceC1172050gbb
            public final void LIZJ() {
                this.Lo().kl();
            }

            @Override // X.InterfaceC1172050gbb
            public final void LIZLLL() {
                this.Jo().xQ2(true);
            }

            @Override // X.InterfaceC1172050gbb
            public final void LJJJLIIL() {
                this.Lo().P7();
            }

            @Override // X.InterfaceC1172050gbb
            public final void LIZ(boolean z4) {
                this.Lo().Wq(z4);
            }
        });
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String strJ4;
        int i;
        int iIntValue;
        Integer numLIZJ;
        String string;
        TextView textView = (TextView) view.findViewById(R.id.umv);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.e6g);
        View viewFindViewById = view.findViewById(R.id.nyl);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.poi);
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.poj);
        View viewFindViewById2 = view.findViewById(R.id.bmy);
        final TextView textView2 = (TextView) view.findViewById(R.id.p09);
        TextView textView3 = (TextView) view.findViewById(R.id.dat);
        final TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k1v);
        final C197039127h c197039127h3 = (C197039127h) view.findViewById(R.id.crw);
        View viewFindViewById3 = view.findViewById(R.id.k28);
        View viewFindViewById4 = view.findViewById(R.id.k23);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w28);
        C197039127h c197039127h4 = (C197039127h) view.findViewById(R.id.aeu);
        C197039127h c197039127h5 = (C197039127h) view.findViewById(R.id.cms);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        final float fLIZIZ = C418440Gaw.LIZIZ(120);
        c197039127h3.setButtonSize(0);
        c197039127h3.LJJJJI(14.0f);
        recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0gaC
            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView2, int i2, int i3) {
                float f;
                float fComputeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                float f2 = fLIZIZ;
                if (fComputeVerticalScrollOffset > f2) {
                    f = 1.0f;
                } else {
                    f = fComputeVerticalScrollOffset / f2;
                }
                boolean z = false;
                if (C1171200gaE.LIZIZ() == 1) {
                    C197039127h c197039127h6 = c197039127h3;
                    if (f > 0.0f) {
                        z = true;
                    }
                    c197039127h6.setEnabled(z);
                    C786410Ut5.w5(c197039127h3, f);
                    return;
                }
                C786410Ut5.x5(tuxIconView, f);
                TuxIconView tuxIconView2 = tuxIconView;
                if (f > 0.0f) {
                    z = true;
                }
                tuxIconView2.setEnabled(z);
                C786410Ut5.S4(f, textView2);
            }
        });
        C786410Ut5.I7(new AbS699S0100000_18(c19egLIZ, 3, 42), viewFindViewById2);
        if (C1171200gaE.LIZIZ() == 1) {
            C786410Ut5.I7(new AbS508S0200000_18(c19egLIZ, this, 3), c197039127h3);
        } else {
            C786410Ut5.I7(new AbS699S0100000_18(this, 4, 42), tuxIconView);
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 5, 42), textView3);
        Context context = getContext();
        if (context != null && (string = context.getString(2131834484)) != null) {
            strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{CardStruct.IStatusCode.DEFAULT}, 1));
        } else {
            strJ4 = null;
        }
        textView.setText(strJ4);
        if (C1171750gb7.LIZ()) {
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            textView.setTextColor(iIntValue);
        }
        C786410Ut5.I7(new AbS508S0200000_18(c19egLIZ, this, 4), c197039127h);
        c197039127h2.setButtonVariant(1);
        c197039127h.setButtonVariant(1);
        C786410Ut5.I7(new AbS699S0100000_18(this, 6, 42), c197039127h2);
        C786410Ut5.I7(new AbS699S0100000_18(this, 7, 42), viewFindViewById4);
        TuxIconView tuxIconView2 = (TuxIconView) viewFindViewById4;
        List<CollaborativeUser> list = No().collaborativeUserList;
        if (list != null && !list.isEmpty()) {
            i = R.raw.icon_ellipsis_horizontal;
        } else {
            i = R.raw.icon_arrow_turn_up_right;
        }
        tuxIconView2.setIconRes(i);
        Context context3 = c1749280vcc.getContext();
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gZu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1170570gZD) obj).LL;
            }
        }, null, new AwS115S0400000_18(viewFindViewById4, c1749280vcc, context3, this, 2), new AwS562S0100000_18(c1749280vcc, 282), new AwS384S0200000_18(this, textView2, 46), 2, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gZx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1170570gZD) obj).LLILLJJLI;
            }
        }, null, new AwS227S0300000_18(c1749280vcc, context3, this, 17), new C1171170gaB(c1749280vcc, tuxIconView, c197039127h3, viewFindViewById2, viewFindViewById4, viewFindViewById3, textView3, viewFindViewById, c197039127h5), new C1171150ga9(this, c1749280vcc, c197039127h5, context3, tuxIconView, c197039127h3, c197039127h4, textView2, textView, viewFindViewById2, viewFindViewById4, viewFindViewById3, textView3, viewFindViewById, c197039127h, c197039127h2, recyclerView, c19egLIZ), 2, null);
    }
}
