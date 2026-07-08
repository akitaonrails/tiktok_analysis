package com.ss.android.ugc.aweme.unifiedauth.push;

import X.C01GW;
import X.C0HZQ;
import X.C19207110Cf;
import X.C20684815ws;
import X.C211000rc;
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
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PushUserGuideSubSwitchCell extends PowerCell<C19207110Cf> implements View.OnClickListener {
    public C0HZQ LL;
    public TuxTextView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 587));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C19207110Cf c19207110Cf = (C19207110Cf) interfaceC1891350zJl;
        super.onBindItemView(c19207110Cf);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c19207110Cf.LLILLJJLI);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        PushUserGuideSubSwitchVM pushUserGuideSubSwitchVM;
        if (view instanceof C0HZQ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onClick(");
            C19207110Cf item = getItem();
            if (item != null) {
                str = item.LLILLJJLI;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            C211000rc.LIZ("PushUserGuideSubSwitchCell");
            C19207110Cf item2 = getItem();
            if (item2 != null) {
                String str3 = item2.LLILLL;
                if (str3 != null && (pushUserGuideSubSwitchVM = (PushUserGuideSubSwitchVM) this.LLILLL.getValue()) != null) {
                    pushUserGuideSubSwitchVM.LL.postValue(new Pair<>(str3, Boolean.valueOf(((CompoundButton) view).isChecked())));
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("enter_from", item2.LL.enterFrom);
                c2344009Gk.LJFF("enter_method", item2.LL.enterMethod);
                c2344009Gk.LJFF("trigger", item2.LL.trigger);
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
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.af3, viewGroup, false);
        this.LL = (C0HZQ) viewTd.findViewById(R.id.y5k);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.wv9);
        C0HZQ c0hzq = this.LL;
        if (c0hzq != null) {
            C786410Ut5.b9(c0hzq, this);
        }
        C0HZQ c0hzq2 = this.LL;
        if (c0hzq2 != null) {
            C786410Ut5.LLLLLZ(c0hzq2, 0);
        }
        return viewTd;
    }
}
