package com.ss.android.ugc.tiktok.addyours.route;

import X.AbstractC453920Hr4;
import X.C1388190mED;
import X.C1389340mG4;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1440005kM;
import X.C19EG;
import X.C2108208Ns;
import X.C23250099c;
import X.C304900BxI;
import X.C417101jl;
import X.C418440Gaw;
import X.C453910Hr3;
import X.C453940Hr6;
import X.C730000SkI;
import X.C814420VxA;
import X.C817503Hh;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursTopicDetailFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursTopicDetailRouterAction implements IRouteAction {
    public final void realOpenDetailFragment(Context context, Bundle bundle) {
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        FragmentManager supportFragmentManager;
        if (C304900BxI.LIZ() && bundle != null && !bundle.isEmpty() && (bundle.containsKey("topic") || bundle.containsKey("add_yours_topic_id"))) {
            if (context != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) != null) {
                C730000SkI.LIZIZ.LIZIZ(249372161);
                AddYoursTopicDetailFragment.LLJJJJ.getClass();
                AddYoursTopicDetailFragment addYoursTopicDetailFragment = new AddYoursTopicDetailFragment();
                addYoursTopicDetailFragment.setArguments(bundle);
                C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) new C453910Hr3("enter_add_yours")));
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = addYoursTopicDetailFragment;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LIZ.LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) C1389340mG4.LIZLLL()) * 0.74d)));
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJIIJIL = false;
                tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0OFN
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C1440005kM.LIZ(new C453940Hr6(false, false, 4));
                    }
                };
                tuxSheet2.show(supportFragmentManager, "AddYoursTopicDetailFragment");
                return;
            }
            return;
        }
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
        c1389890mGx.LJIIIZ(2131844863);
        c1389890mGx.LJIIJJI();
    }

    /* JADX INFO: renamed from: open, reason: collision with other method in class */
    public void m352open(Context context, String str, Bundle bundle) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            realOpenDetailFragment(context, bundle);
        } else {
            C23250099c.LIZLLL(C817503Hh.LL, C2108208Ns.LIZ, null, new C417101jl(this, context, bundle, null), 2);
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public /* bridge */ /* synthetic */ Object open(Context context, String str, Bundle bundle) {
        m352open(context, str, bundle);
        return Unit.LIZ;
    }
}
