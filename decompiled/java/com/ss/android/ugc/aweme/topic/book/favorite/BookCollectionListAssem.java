package com.ss.android.ugc.aweme.topic.book.favorite;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C04J2;
import X.C0O4X;
import X.C0OAT;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1722300uv6;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C264720AZa;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452070Ho5;
import X.C452501pT;
import X.C613490O4l;
import X.C622680Oba;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1603190roz;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS139S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BookCollectionListAssem extends DetailListAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1538));
    public final AssemVMLazy LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BookCollectionListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/book/favorite/viewmodel/BookCollectionListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    public BookCollectionListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BookCollectionListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1539);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(638);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((AbstractC738140SxQ) this, 1540), aFwS240S0000000_9, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJJJ = assemVMLazy;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class BookItemCell extends PowerCell<C0OAT> {
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
            String str;
            List<String> urlList;
            C0OAT c0oat = (C0OAT) interfaceC1891350zJl;
            TopicRawInfo topicRawInfo = c0oat.LL;
            C786410Ut5.I7(new ACListenerS139S0100000_4(topicRawInfo, 50), this.itemView);
            ((TextView) this.itemView.findViewById(R.id.zym)).setText(topicRawInfo.title);
            ((TextView) this.itemView.findViewById(R.id.z_i)).setText(topicRawInfo.authorName);
            if (C264720AZa.LIZJ) {
                Double dLIZIZ = c0oat.LL.LIZIZ();
                if (dLIZIZ == null) {
                    C786410Ut5.LJZL(8, (LinearLayout) this.itemView.findViewById(R.id.srp));
                } else {
                    C786410Ut5.LJZL(0, (LinearLayout) this.itemView.findViewById(R.id.srp));
                    ((TextView) this.itemView.findViewById(R.id.srz)).setText(dLIZIZ.toString());
                }
            }
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.ld7);
            C786410Ut5.G6(smartImageView, smartImageView.getLayoutParams());
            UrlModel urlModel = topicRawInfo.cover;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            c1331670kl3LJIIIZ.LJIIJ(new C04J2(smartImageView, 1));
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fw5, viewGroup, false);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C613490O4l c613490O4l) {
        TopicRawInfo topicRawInfo = c613490O4l.LIZ;
        if (topicRawInfo != null) {
            Integer num = topicRawInfo.type;
            int type = C0O4X.BOOK.getType();
            if (num != null && num.intValue() == type) {
                C0OAT c0oat = new C0OAT(topicRawInfo, null, null, null, null, 30);
                if (c613490O4l.LIZIZ) {
                    if (mp().getState().LJIIIIZZ() == 0) {
                        C786410Ut5.LLLZLZ(sp(), 8);
                        C786410Ut5.LLF(0, mp());
                    }
                    C20600815jK.LIZIZ(mp().getState(), 0, c0oat);
                    mp().scrollToPosition(0);
                    return;
                }
                C20600815jK.LJIIL(mp().getState(), c0oat);
                sp().setStatus(lp());
                if (mp().getState().LJIIIIZZ() != 0) {
                    return;
                }
                C786410Ut5.LLLZLZ(sp(), 0);
                C786410Ut5.LLF(8, mp());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        mp().LJIILJJIL(BookItemCell.class);
        mp().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        mp().setLifecycleOwner(this);
        mp().LJIJI();
        if (!((Boolean) this.LLJJJIL.getValue()).booleanValue()) {
            sp().setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(187)));
            sp().setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(193)));
        } else {
            sp().setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            sp().setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        }
        C1722300uv6 c1722300uv6Lp = lp();
        Object obj = getConfig().LLILZ.get("status_title");
        String str2 = "";
        if (obj == null) {
            str = "";
        } else {
            str = (String) obj;
        }
        c1722300uv6Lp.LJI = str;
        Object obj2 = getConfig().LLILZ.get("status_message");
        if (obj2 != null) {
            str2 = (String) obj2;
        }
        c1722300uv6Lp.LJIIIIZZ = str2;
        if (!((Boolean) this.LLJJJIL.getValue()).booleanValue()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_map_pin;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6Lp.LIZ(c419910GdJ);
        }
        if (!(getContext() instanceof InterfaceC1603190roz)) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_large_bookmark;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6Lp.LIZ(c419910GdJ2);
        }
        yp();
    }
}
