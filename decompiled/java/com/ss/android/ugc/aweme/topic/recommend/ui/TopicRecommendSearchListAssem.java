package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.AbstractC738140SxQ;
import X.C0O4X;
import X.C1220000hqw;
import X.C13LE;
import X.C1558360qeg;
import X.C1722300uv6;
import X.C1770850wBP;
import X.C20600815jK;
import X.C20603715jn;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicRecommendSearchListAssem extends DetailListAssem {
    public final C736950SvV LLJJJIL;

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final void up() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvMp = mp();
        viewOnAttachStateChangeListenerC20604515jvMp.setListConfig(op());
        AssemListViewModel assemListViewModel = (AssemListViewModel) this.LLJJJIL.getValue();
        if (assemListViewModel.state == null) {
            assemListViewModel.setListState(new C20600815jK<>());
        }
        viewOnAttachStateChangeListenerC20604515jvMp.LJIIL(((AssemListViewModel) this.LLJJJIL.getValue()).getConfig());
        mp().setItemAnimator(null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0Oih
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OAO) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 149), 6);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final C20603715jn op() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZ = 5;
        return c20603715jn;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel tp() {
        return (AssemListViewModel) this.LLJJJIL.getValue();
    }

    public TopicRecommendSearchListAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1565);
        this.LLJJJIL = new C736950SvV(C13LE.LIZ(TopicRecommendListVM.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(651), new AwS553S0100000_9((AbstractC738140SxQ) this, 1564), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer num;
        String str;
        String str2;
        super.onViewCreated(view);
        Object obj = getConfig().LLILZ.get("topic_type");
        Integer num2 = null;
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        C0O4X c0o4x = C0O4X.BOOK;
        int type = c0o4x.getType();
        if (num != null && num.intValue() == type) {
            C1722300uv6 c1722300uv6Lp = lp();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_magnify_glass;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6Lp.LIZJ = 0;
            c1722300uv6Lp.LIZIZ = c419910GdJ;
            Object obj2 = getConfig().LLILZ.get("empty_title");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            c1722300uv6Lp.LJI = str;
            Object obj3 = getConfig().LLILZ.get("empty_desc");
            if ((obj3 instanceof String) && (str2 = (String) obj3) != null) {
                str3 = str2;
            }
            c1722300uv6Lp.LJIIIIZZ = str3;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            Object obj4 = getConfig().LLILZ.get("topic_type");
            if (obj4 instanceof Integer) {
                num2 = (Integer) obj4;
            }
            int type2 = c0o4x.getType();
            if (num2 != null && num2.intValue() == type2) {
                mp().LJIILJJIL(BookRecommendSearchCell.class);
            }
            mp().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            mp().setLifecycleOwner(this);
            AssemViewModel assemViewModel = (AssemViewModel) this.LLJJJIL.getValue();
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZ = true;
            assemViewModel.asyncSubscribe(new C2217381BqS() { // from class: X.0Oii
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj5) {
                    C0OAO c0oao = (C0OAO) obj5;
                    c0oao.getClass();
                    return C627260Oiy.LIZLLL(c0oao);
                }
            }, this, c1770850wBP, new AwS588S0100000_9(interfaceC665370Q7zLJFF, 405), new AwS553S0100000_9(interfaceC665370Q7zLJFF, 1563), new AwS375S0200000_9(this, interfaceC665370Q7zLJFF, 101));
            yp();
            zp();
        }
    }
}
