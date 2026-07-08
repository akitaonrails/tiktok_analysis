package com.ss.android.ugc.tiktok.tns.userrelation.block;

import X.C013C;
import X.C0C64;
import X.C11O8;
import X.C1239300iM4;
import X.C127A;
import X.C127K;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1667580tUq;
import X.C19EG;
import X.C20642515q3;
import X.C299940BpI;
import X.C344610Df9;
import X.C344660DfE;
import X.C346340Dhw;
import X.C384050F3z;
import X.C418440Gaw;
import X.C770750ULh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.EnumC1216650hlX;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService;
import com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS3S2301000_4;
import kotlin.jvm.internal.AwS40S0500000_4;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes5.dex */
public final class BlockServiceImpl implements IBlockService {
    @Override // com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService
    public final void LIZJ(C19EG c19eg) {
        C344610Df9 c344610Df9 = new C344610Df9();
        if (C344610Df9.LIZLLL) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIIZ(2131827593);
            c1389890mGx.LJIIJJI();
            return;
        }
        long jCurrentTimeMillis = ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - c344610Df9.LIZJ.getLong("block_limit_dialog_timestamp", 0L)) / ((long) 60);
        IComplianceDebugService iComplianceDebugService = (IComplianceDebugService) ServiceManager.get().getService(IComplianceDebugService.class);
        if (iComplianceDebugService != null) {
            iComplianceDebugService.LJ();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_release_block_for_users", true, false) && jCurrentTimeMillis >= 480) {
            C770750ULh c770750ULh = new C770750ULh();
            c770750ULh.LJ = c19eg.getString(2131827597);
            c770750ULh.LIZJ(c19eg.getString(2131827596));
            c770750ULh.LJI(c19eg.getString(2131827591), new AwS370S0200000_4(c344610Df9, c19eg, 69));
            c770750ULh.LJII(c19eg.getString(2131827590), new AwS583S0100000_4(c19eg, 243));
            c770750ULh.LJIJ = true;
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            c344610Df9.LIZ = tuxSheet;
            if (tuxSheet == null) {
                return;
            }
            tuxSheet.show(c19eg.getSupportFragmentManager(), "BlockLimitDialog");
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LIZ(2131844890);
        C985403tE.LIZ(c1397580mTM, new AwS583S0100000_4(c19eg, 245));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService
    public final CharSequence LJ(User user, String str) {
        if (user.getFpBlockByType() == 1) {
            return C20642515q3.LJI(2131821716);
        }
        if (user.getFpBlockByType() != 2) {
            return str;
        }
        return C20642515q3.LJI(2131821715);
    }

    @Override // com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService
    public final void LIZ(Context context, String str, Function0 function0, Function1 function1) {
        FragmentManager supportFragmentManager;
        C013C c013c = new C013C();
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LJ = context.getString(2131837594, str);
        c770750ULh.LIZJ(context.getString(2131837593, str));
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJI(context.getString(R.string.unBlock), new AwS368S0200000_2(function1, (Function1<? super Boolean, Unit>) c013c, (C013C) 103));
        c770750ULh.LJII(context.getString(2131837590), new AwS583S0100000_4(function0, (Function0<Unit>) 246));
        c770750ULh.LJIJ = true;
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        c1390920mIcLIZIZ.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "block_user_sheet");
        }
    }

    @Override // com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService
    public final void LIZLLL(Context context, String str, final String str2, Function1 function1) {
        boolean z;
        FragmentManager supportFragmentManager;
        C013C c013c = new C013C();
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LJ = C786410Ut5.j4(context.getString(2131837589), Arrays.copyOf(new Object[]{str}, 1));
        c770750ULh.LJ(new C1667580tUq(R.raw.icon_danmu_slash_fill, null, context.getString(2131837583), C1308910kAL.LIZJ(R.attr.a1k, context), 2), new C1667580tUq(R.raw.icon_bell_slash_fill, null, context.getString(2131837584), C1308910kAL.LIZJ(R.attr.a1k, context), 2), new C1667580tUq(R.raw.icon_eye_fill, null, context.getString(2131837585), C1308910kAL.LIZJ(R.attr.a1k, context), 2), new C1667580tUq(R.raw.icon_gear_fill, null, context.getString(2131837586), C1308910kAL.LIZJ(R.attr.a1k, context), 2));
        C127K c127k = new C127K(context, null, 6);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1c, context);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1c);
        c127k.setBackground(c384050F3z.LIZ(context));
        c127k.setWithSeparator(false);
        c127k.setSubtitle(context.getString(2131837588));
        c127k.setTitle(context.getString(2131837587));
        C127A c127a = new C127A(context);
        if (((Number) C299940BpI.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        c127a.LJIILJJIL(z);
        c013c.element = c127a.LJIILIIL();
        c127a.LJIILLIIL(new C346340Dhw(c013c, 1));
        c127k.setAccessory(c127a);
        c127k.setInset(EnumC1216650hlX.PADDING_16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C786410Ut5.Y6(c127k, layoutParams);
        c770750ULh.LJIILL = c127k;
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJI(context.getString(R.string.eh0), new AwS368S0200000_2(function1, (Function1<? super Boolean, Unit>) c013c, (C013C) 102));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        c1390920mIcLIZIZ.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.06n4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                c2344009Gk.LJIIIIZZ("target", "cancel");
                C20684815ws.LJIILLIIL("block_confirm", c2344009Gk.LIZ);
            }
        };
        c1390920mIcLIZIZ.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "block_user_sheet");
        }
    }

    @Override // com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService
    public final void LJFF(Context context, String str, String str2, AwS563S0100000_19 awS563S0100000_19, AFwS257S0000000_19 aFwS257S0000000_19) {
        BlockManager.LIZ.getClass();
        C11O8 c11o8LIZ = C344660DfE.LIZ(str, 2, str2);
        if (c11o8LIZ != null) {
            C1239300iM4.LJ(c11o8LIZ, new AwS370S0200000_4(context, aFwS257S0000000_19, 66), C1239300iM4.LIZJ, new AwS370S0200000_4(context, awS563S0100000_19, 67));
        }
    }

    @Override // com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService
    public final void LJI(Context context, User user, String str, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        if (context != null) {
            String string = context.getResources().getString(2131821653, user.getUniqueId());
            if (TextUtils.isEmpty(str)) {
                str = context.getResources().getString(2131821651);
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(string);
            c1397580mTM.LIZIZ(str);
            C985403tE.LIZ(c1397580mTM, new AwS40S0500000_4(context, (Context) user, (User) function1, (Function1<? super Throwable, Unit>) context, (Context) function0, (Function0<Unit>) 1));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService
    public final void LIZIZ(Context context, User user, String str, String str2, AwS168S1100000_19 awS168S1100000_19, AwS70S1000000_19 awS70S1000000_19) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getResources().getString(2131821708, user.getUniqueId()));
        c1397580mTM.LIZIZ(context.getResources().getString(2131821706));
        C985403tE.LIZ(c1397580mTM, new AwS3S2301000_4(str, str2, awS70S1000000_19, context, awS168S1100000_19, 1));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
