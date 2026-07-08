package com.ss.android.ugc.aweme.notification.v2.assem;

import X.C01D1;
import X.C01GW;
import X.C10VP;
import X.C1387040mCM;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1559260qg8;
import X.C1619080sEc;
import X.C1637806bA;
import X.C1720106oR;
import X.C1868400yik;
import X.C1889530zGp;
import X.C1902330zbT;
import X.C1902360zbW;
import X.C1902710zc5;
import X.C1903780zdo;
import X.C1904270zeb;
import X.C1906760zic;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C487280J9a;
import X.C622680Oba;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897980ZKq;
import X.C960203pA;
import X.InterfaceC1902350zbV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS162S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationTabBarAssem extends UIContentAssem implements InterfaceC1902350zbV, InterfaceC487330J9f {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public TuxTextView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public TuxIconView LLJI;
    public ImageView LLJIJIL;
    public C1902360zbW LLJJ;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723580SZw(this, C1868400yik.class, "notification_fragment_params"), checkSupervisorPrepared());
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(294));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(295));
    public List<GroupFilterStruct> LLJJI = C13BV.INSTANCE;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1868400yik.class, "notification_fragment_params"), checkSupervisorPrepared());
    public int LLJJIJI = Integer.MIN_VALUE;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationTabBarAssem.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NotificationTabBarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 813), AFwS271S0000000_28.get$arr$(180), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final TuxIconView Ho() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.lh5) : null;
            this.LLJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final NotificationFragmentV2ViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (NotificationFragmentV2ViewModel) assemVMLazy.getValue();
    }

    public final TuxTextView Lo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zoe) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void No() {
        View viewFindViewById;
        int i = this.LLJJIJI;
        if ((i == Integer.MIN_VALUE ? C1903780zdo.LJIIJ(C1904270zeb.LIZJ) : C1903780zdo.LJII().LJJ(i)) > 0) {
            View view = this.LLJIJIL;
            if (view == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ly0) : null;
                this.LLJIJIL = (ImageView) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LJZI(0, (ImageView) view);
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            viewFindViewById = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.ly0) : null;
            this.LLJIJIL = (ImageView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.LJZI(8, (ImageView) view2);
    }

    public final Integer Go() {
        GroupFilterStruct groupFilterStruct = Jo().getState().LLILLJJLI;
        if (groupFilterStruct != null) {
            return Integer.valueOf(groupFilterStruct.noticeGroup);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C19EG activity;
        super.onCreate();
        C622680Oba.LIZJ(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null) {
            return;
        }
        C487280J9a.LIZ(activity.hashCode(), this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C19EG activity;
        Intent intent;
        super.onResume();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("is_from_push", false)) {
            return;
        }
        Integer numGo = Go();
        int i = C1904270zeb.LIZJ;
        if (numGo == null || numGo.intValue() != i) {
            C1902360zbW c1902360zbW = this.LLJJ;
            if (c1902360zbW != null) {
                ((LiveData) c1902360zbW.LLILZLL.LL.getValue()).postValue(Integer.valueOf(C1904270zeb.LIZJ));
            }
            GroupFilterStruct groupFilterStruct = (GroupFilterStruct) C13LP.LJJJLL(this.LLJJI);
            if (groupFilterStruct != null) {
                yg(groupFilterStruct);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C1619080sEc c1619080sEc) {
        if (this.LLILZ) {
            C1868400yik c1868400yik = (C1868400yik) this.LLJILJIL.getValue();
            if (c1868400yik != null && c1868400yik.LL) {
                return;
            }
            C1902360zbW c1902360zbW = this.LLJJ;
            if (c1902360zbW != null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = c1902360zbW.LLILZ;
                if (viewOnAttachStateChangeListenerC20604515jv == null) {
                    viewOnAttachStateChangeListenerC20604515jv = null;
                }
                viewOnAttachStateChangeListenerC20604515jv.LJIIJ();
            }
            C1902360zbW c1902360zbW2 = this.LLJJ;
            if (c1902360zbW2 != null && c1902360zbW2.isShowing()) {
                return;
            }
            No();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        boolean z2;
        int iIntValue;
        Context context;
        Integer num;
        super.onViewCreated(view);
        if (C897980ZKq.LIZ()) {
            NotificationFragmentV2.LLJILJIL.getClass();
            C1889530zGp.LIZ("NotificationTabBarAssem", "children model");
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notificationParams: ");
        sbLIZ.append(this.LLJJIII.getValue());
        C1720106oR.LJI("rcTest", C2188811AlT.LIZIZ(sbLIZ));
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModelJo = Jo();
        C1868400yik c1868400yik = (C1868400yik) this.LLJJIII.getValue();
        if (c1868400yik != null && c1868400yik.LL) {
            z = true;
        } else {
            z = false;
        }
        notificationFragmentV2ViewModelJo.xQ2(z);
        C1868400yik c1868400yik2 = (C1868400yik) this.LLJJIII.getValue();
        if (c1868400yik2 != null && c1868400yik2.LL) {
            z2 = true;
        } else {
            z2 = false;
        }
        View viewFindViewById = null;
        CharSequence text = null;
        if (z2) {
            TuxTextView tuxTextViewLo = Lo();
            Context context2 = getContext();
            if (context2 != null) {
                text = context2.getText(2131824675);
            }
            tuxTextViewLo.setText(text);
            return;
        }
        C1868400yik c1868400yik3 = (C1868400yik) this.LLJJIII.getValue();
        if (c1868400yik3 != null && (num = c1868400yik3.LLILZ) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MIN_VALUE;
        }
        this.LLJJIJI = iIntValue;
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0zaW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900660zYm) obj).LLILZ;
            }
        }, this, null, null, null, new AwS607S0100000_28(this, 102), 28, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0zaX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900660zYm) obj).LLJI;
            }
        }, null, new AwS642S0100000_28(this, 22), 6);
        View view2 = this.LLJ;
        if (view2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.peq);
            }
            this.LLJ = (ConstraintLayout) viewFindViewById;
            view2 = viewFindViewById;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
        if (constraintLayout != null) {
            C10VP.LIZIZ(constraintLayout);
            C786410Ut5.Y7(constraintLayout, new ACListenerS162S0100000_28(this, 65));
        }
        TuxTextView tuxTextViewLo2 = Lo();
        if (tuxTextViewLo2 != null) {
            tuxTextViewLo2.setText(tuxTextViewLo2.getContext().getString(2131824675));
        }
        TuxIconView tuxIconViewHo = Ho();
        if (tuxIconViewHo != null) {
            C786410Ut5.LLLLLLZZ(tuxIconViewHo, 0);
            C1387040mCM.LIZ(tuxIconViewHo, AFwS315S0000000_28.get$arr$(20));
            if (C1906760zic.LIZIZ()) {
                tuxIconViewHo.setIconRes(R.raw.icon_arrow_triangle_up_fill_ltr);
                tuxIconViewHo.setTintColorRes(R.attr.a1k);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (context = fragmentLJI.getContext()) != null) {
                    gradientDrawable.setColor(C960203pA.LIZ(R.attr.a03, context));
                }
                tuxIconViewHo.setBackground(gradientDrawable);
                C19ME c19me = new C19ME((C19ME) tuxIconViewHo.getLayoutParams());
                c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                C786410Ut5.M6(tuxIconViewHo, c19me);
                C786410Ut5.Fb(tuxIconViewHo, 180.0f);
            }
        }
    }

    @Override // X.InterfaceC1902350zbV
    public final void yg(GroupFilterStruct groupFilterStruct) {
        int i;
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGroupSelected: ");
        sbLIZ.append(groupFilterStruct.noticeGroup);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationTabBarAssem", strLIZIZ);
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModelJo = Jo();
        notificationFragmentV2ViewModelJo.setState(new AwS394S0200000_28(notificationFragmentV2ViewModelJo, groupFilterStruct, 89));
        TuxTextView tuxTextViewLo = Lo();
        if (tuxTextViewLo != null) {
            Context context = tuxTextViewLo.getContext();
            if (groupFilterStruct.noticeGroup == C1904270zeb.LIZJ) {
                i = 2131824675;
            } else {
                i = groupFilterStruct.titleResId;
            }
            String string = context.getString(i);
            tuxTextViewLo.setText(string);
            C1387040mCM.LIZ(tuxTextViewLo, new C1902330zbT(string));
        }
        C1902360zbW c1902360zbW = this.LLJJ;
        if (c1902360zbW != null) {
            c1902360zbW.dismiss();
        }
        String strLIZ = C1902710zc5.LIZ(Go());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("to_tab_name", strLIZ);
        C20684815ws.LJIILLIIL("change_notification_tab", linkedHashMap);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1902360zbW c1902360zbW = this.LLJJ;
        if (c1902360zbW != null && c1902360zbW.isShowing()) {
            return;
        }
        this.LLJJ = null;
    }
}
