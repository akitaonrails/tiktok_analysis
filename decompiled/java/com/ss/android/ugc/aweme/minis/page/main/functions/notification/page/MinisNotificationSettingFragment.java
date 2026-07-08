package com.ss.android.ugc.aweme.minis.page.main.functions.notification.page;

import X.C01GW;
import X.C08S3;
import X.C098200Yq;
import X.C0OM1;
import X.C0PEM;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C320101Lz;
import X.C635070OvZ;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class MinisNotificationSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtLip9JSQlJ2E1PSsvPSY8JjZiHELIOSJyAnISMlKi4nISoiZz8yLyBiBCY9ITYCJjs6LiwvKDs6JysfLDsnISsrDz0yLygpJzs=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, (Function0) null, "router_params", MinisNotificationSettingsParams.class);
    public C127A LLIZLLLIL;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLIZLLLIL = null;
        super.onDestroyView();
    }

    public final MinisNotificationSettingsParams SR() {
        return (MinisNotificationSettingsParams) this.LLIZ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        super.onResume();
        C127A c127a = this.LLIZLLLIL;
        if (c127a == null || (str = SR().schemaParserData.clientKey) == null) {
            return;
        }
        c127a.LJIIJJI(true);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C320101Lz(str, c127a, null), 2);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(408));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            TuxNavBar tuxNavBar = (TuxNavBar) activity.findViewById(R.id.p15);
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS553S0100000_9(activity, 40));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = activity.getString(R.string.m_j);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.setNavBackground(0);
            C127K c127k = (C127K) activity.findViewById(R.id.wiu);
            TextView textView = (TextView) activity.findViewById(R.id.zwx);
            String string = activity.getString(2131822214);
            Object[] objArr = new Object[1];
            TiktokMinisQueryParams tiktokMinisQueryParams = SR().schemaParserData.tiktokMinisParams;
            if (tiktokMinisQueryParams == null || (str = tiktokMinisQueryParams.minisName) == null) {
                str = "Minis";
            }
            objArr[0] = str;
            c127k.setSubtitle(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
            C127M accessory = c127k.getAccessory();
            if (accessory != null) {
                accessory.LJIIJJI(true);
            }
            C127M accessory2 = c127k.getAccessory();
            if (accessory2 != null && (accessory2 instanceof C127A)) {
                C127A c127a = (C127A) accessory2;
                this.LLIZLLLIL = c127a;
                c127a.LJIILL(new AwS253S0300000_9(this, accessory2, activity, 0));
            }
            final C19EG activity2 = getActivity();
            if (activity2 != null) {
                String string2 = activity2.getString(2131822216);
                String strJ4 = C786410Ut5.j4(activity2.getString(2131822215), Arrays.copyOf(new Object[]{string2}, 1));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, activity2);
                if (numLIZJ != null) {
                    final int iIntValue = numLIZJ.intValue();
                    int iLJJJ = a0.LJJJ(strJ4, string2, 0, false, 6);
                    int length = string2.length() + iLJJJ;
                    SpannableString spannableString = new SpannableString(strJ4);
                    C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0OvY
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view2) {
                            C635070OvZ c635070OvZ = C635070OvZ.LIZ;
                            SchemaParserData schemaParserData = this.LL.SR().schemaParserData;
                            c635070OvZ.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(schemaParserData.LIZLLL());
                            linkedHashMap.put("click_position", "system_notification_setting_page");
                            C08S3.LIZ.getClass();
                            C08S3.LIZJ("tm_minis_notification_page_click", linkedHashMap);
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity2, "aweme://inbox/system_notice/unsubscribe_setting_new/detail?channel_id=666");
                            smartRouteBuildRoute.withParam("enter_from", "minis");
                            smartRouteBuildRoute.open();
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setColor(iIntValue);
                            textPaint.setUnderlineText(false);
                            C444890HcV c444890HcV = new C444890HcV();
                            c444890HcV.LIZ(62);
                            textPaint.setTypeface(c444890HcV.getTypeface());
                        }
                    }, iLJJJ, length, 33);
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), iLJJJ, length, 33);
                    textView.setText(spannableString);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        C635070OvZ c635070OvZ = C635070OvZ.LIZ;
        SchemaParserData schemaParserData = SR().schemaParserData;
        c635070OvZ.getClass();
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> mapLIZLLL = schemaParserData.LIZLLL();
        c08s3.getClass();
        C08S3.LIZJ("tm_minis_notification_page_show", mapLIZLLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.jf, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
