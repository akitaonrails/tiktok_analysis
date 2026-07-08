package com.ss.android.ugc.aweme.notification.view.guidepush;

import X.C01GW;
import X.C0HZQ;
import X.C10CS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.vm.GuideUserSwitchVM;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class GuideOutPushSwitchCell extends PowerCell<C10CS> implements View.OnClickListener {
    public C0HZQ LL;
    public TuxTextView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 483));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C10CS c10cs = (C10CS) interfaceC1891350zJl;
        super.onBindItemView(c10cs);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(c10cs.LLILLJJLI);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        GuideUserSwitchVM guideUserSwitchVM;
        if (view instanceof C0HZQ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guide_outpush click ");
            C10CS item = getItem();
            if (item != null) {
                str = item.LLILLJJLI;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(" checkbox");
            C2188811AlT.LIZIZ(sbLIZ);
            C10CS item2 = getItem();
            if (item2 != null) {
                String str3 = item2.LLILLL;
                if (str3 != null && (guideUserSwitchVM = (GuideUserSwitchVM) this.LLILLL.getValue()) != null) {
                    guideUserSwitchVM.LL.postValue(new Pair<>(str3, Boolean.valueOf(((CompoundButton) view).isChecked())));
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("enter_from", item2.LL.LIZIZ);
                c2344009Gk.LJFF("enter_method", item2.LL.LIZJ);
                c2344009Gk.LJFF("trigger", item2.LL.LIZLLL);
                String str4 = item2.LLILLL;
                if (str4 != null) {
                    switch (str4.hashCode()) {
                        case -2081740044:
                            if (str4.equals("digg_push")) {
                                c2344009Gk.LJFF("sub_type", "likes");
                            }
                            break;
                        case 795516154:
                            if (str4.equals("comment_push")) {
                                c2344009Gk.LJFF("sub_type", "comments");
                            }
                            break;
                        case 1596510952:
                            if (str4.equals("follow_push")) {
                                c2344009Gk.LJFF("sub_type", "new_followers");
                            }
                            break;
                        case 2009230415:
                            if (str4.equals("mention_push")) {
                                c2344009Gk.LJFF("sub_type", "mentions");
                            }
                            break;
                    }
                }
                if (((CompoundButton) view).isChecked()) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                c2344009Gk.LJFF("to_status", str2);
                C20684815ws.LJIILLIIL("click_push_permission", c2344009Gk.LIZ);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a9n, viewGroup, false);
        this.LL = (C0HZQ) viewTd.findViewById(R.id.y5k);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.wv9);
        C0HZQ c0hzq = this.LL;
        C0HZQ c0hzq2 = null;
        if (c0hzq == null) {
            c0hzq = null;
        }
        C786410Ut5.b9(c0hzq, this);
        C0HZQ c0hzq3 = this.LL;
        if (c0hzq3 != null) {
            c0hzq2 = c0hzq3;
        }
        C786410Ut5.LLLLLZ(c0hzq2, 0);
        return viewTd;
    }
}
