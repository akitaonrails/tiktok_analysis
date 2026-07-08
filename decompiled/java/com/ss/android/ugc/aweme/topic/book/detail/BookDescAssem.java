package com.ss.android.ugc.aweme.topic.book.detail;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS500S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BookDescAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final Map<String, Integer> LLJJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BookDescAssem.class, "bookDetailVM", "getBookDetailVM()Lcom/ss/android/ugc/aweme/topic/book/detail/vm/BookDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = C2097908Jt.LIZJ(new Pair("rating", Integer.valueOf(R.id.srp)));
    }

    public BookDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BookDetailVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1521), AFwS240S0000000_9.get$arr$(628), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fvx;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return LLJJJ;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        String string;
        mo127do();
        Map<String, Object> map = getConfig().LLILZ;
        View viewFindViewById = this.LLJJI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.title);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        Object obj = map.get("title");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        textView.setText(str);
        View viewFindViewById3 = this.LLJJIII;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.wgz);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJIII = (TuxTextView) viewFindViewById3;
        }
        TextView textView2 = (TextView) viewFindViewById3;
        Object obj2 = map.get("author");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        Object obj3 = map.get("desc");
        if (obj3 instanceof String) {
            string = (String) obj3;
        } else {
            string = null;
        }
        View view2 = this.LLJJIJI;
        if (view2 == null) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById2 = viewLJJIJL3.findViewById(R.id.fof);
            }
            this.LLJJIJI = (TuxTextView) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        TuxTextView tuxTextView = (TuxTextView) view2;
        if (string == null || string.length() == 0) {
            string = tuxTextView.getContext().getString(2131827850);
        }
        tuxTextView.setText(string);
        C786410Ut5.I7(new AbS500S0200000_9(tuxTextView, this, 3, 42), tuxTextView);
    }
}
