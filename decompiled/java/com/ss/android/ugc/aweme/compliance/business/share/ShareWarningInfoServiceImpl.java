package com.ss.android.ugc.aweme.compliance.business.share;

import X.C03GZ;
import X.C10KE;
import X.C123100dR;
import X.C1235760iGM;
import X.C1238130iKB;
import X.C1388190mED;
import X.C1391420mJQ;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1667580tUq;
import X.C20684815ws;
import X.C2344009Gk;
import X.C340190DVh;
import X.C384000F3u;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C444940Hca;
import X.C770750ULh;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.KtfLinkOnShare;
import com.ss.android.ugc.aweme.feed.model.ShareWarnInfo;
import com.ss.android.ugc.aweme.feed.model.ShareWarnModule;
import com.ss.android.ugc.aweme.feed.model.ShareWarnPopAccessory;
import com.ss.android.ugc.aweme.feed.model.ShareWarnPopContent;
import com.ss.android.ugc.aweme.feed.model.ShareWarnPopWindow;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareWarningInfoServiceImpl implements IShareWarningInfoService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
    public final void LIZ(Aweme aweme) {
        ShareWarnInfo shareWarnInfo;
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        ShareWarnModule shareWarnModule;
        if (aweme != null) {
            AVUploadMiscInfoStruct uploadMiscInfoStruct2 = AwemeExtKt.getUploadMiscInfoStruct(aweme);
            if (uploadMiscInfoStruct2 != null) {
                shareWarnInfo = uploadMiscInfoStruct2.samShareWarnInfo;
            } else {
                shareWarnInfo = null;
            }
            if (shareWarnInfo != null) {
                shareWarnInfo.setHasShown(false);
            }
            if (aweme != null && (uploadMiscInfoStruct = AwemeExtKt.getUploadMiscInfoStruct(aweme)) != null && (shareWarnModule = uploadMiscInfoStruct.shareWarnModule) != null) {
                shareWarnModule.setHasShown(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
    public final boolean LIZIZ(Context context, Aweme aweme, Bundle bundle, Function0<Unit> function0) {
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        ShareWarnModule shareWarnModule;
        CharSequence charSequenceLIZ;
        TextWithInlineLink textWithInlineLink;
        ShareWarnInfo shareWarnInfo;
        if (aweme != null && (shareWarnInfo = AwemeExtKt.getUploadMiscInfoStruct(aweme).samShareWarnInfo) != null && !shareWarnInfo.hasShown) {
            shareWarnInfo.setHasShown(true);
            C770750ULh c770750ULh = new C770750ULh();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_info_circle;
            c770750ULh.LIZ = c419910GdJ.LIZ(context);
            c770750ULh.LIZLLL = 3;
            c770750ULh.LJ = shareWarnInfo.title;
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = shareWarnInfo.learnMoreText;
            c444940Hca.LIZLLL(0);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(43);
            c444940Hca.LJIIIIZZ = new AwS429S0200000_28(context, shareWarnInfo, 72);
            c770750ULh.LJ(new C1667580tUq(R.raw.icon_flag, null, C10KE.LIZIZ(shareWarnInfo.subTitle1, c444940Hca.LIZ(context)), null, 10), new C1667580tUq(R.raw.icon_exclamation_mark_triangle_fill, null, shareWarnInfo.subTitle2, null, 10));
            c770750ULh.LJIILLIIL = true;
            c770750ULh.LJI(context.getString(2131836374), AFwS271S0000000_28.get$arr$(245));
            c770750ULh.LJII(context.getString(2131836376), new AwS607S0100000_28(function0, (Function0<Unit>) 179));
            c770750ULh.LJIJ = true;
            c770750ULh.LIZIZ().LIZ.show(C1388190mED.LIZIZ(context).getSupportFragmentManager(), "SamShareWarningDialog");
            return true;
        }
        new Object() { // from class: X.0zsE
        }.getClass();
        if (aweme == null || (uploadMiscInfoStruct = AwemeExtKt.getUploadMiscInfoStruct(aweme)) == null || (shareWarnModule = uploadMiscInfoStruct.shareWarnModule) == null || shareWarnModule.hasShown || shareWarnModule.popWindow == null) {
            return false;
        }
        shareWarnModule.setHasShown(true);
        ShareWarnPopWindow shareWarnPopWindow = shareWarnModule.popWindow;
        if (shareWarnPopWindow != null) {
            String str = "";
            if (!(!shareWarnPopWindow.content.isEmpty()) || (textWithInlineLink = ((ShareWarnPopContent) ListProtector.get(shareWarnPopWindow.content, 0)).linkText) == null || (charSequenceLIZ = C03GZ.LIZ(textWithInlineLink, context, null, 6)) == null) {
                charSequenceLIZ = "";
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            C1235760iGM.LIZ(c1397580mTM, R.raw.icon_shield_exclamation, null, 6);
            c1397580mTM.LJI(shareWarnPopWindow.title);
            c1397580mTM.LIZIZ(charSequenceLIZ);
            C1238130iKB.LIZ(c1397580mTM, new AwS378S0200000_12(context, (Context) function0, (Function0<Unit>) 44));
            c1397580mTM.LJII = false;
            ShareWarnPopAccessory shareWarnPopAccessory = shareWarnPopWindow.accessory;
            if (shareWarnPopAccessory != null) {
                C1391420mJQ c1391420mJQ = new C1391420mJQ(context);
                c1391420mJQ.LIZJ(true);
                c1391420mJQ.LIZLLL(shareWarnPopAccessory.text);
                c1391420mJQ.LJ(new AwS394S0200000_28(context, shareWarnPopAccessory, 48));
                c1397580mTM.LJIIJJI = c1391420mJQ;
            }
            new C1397510mTF(c1397580mTM).LIZLLL();
            C2344009Gk c2344009Gk = new C2344009Gk();
            String string = bundle.getString("enter_from");
            if (string != null) {
                str = string;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C20684815ws.LJIILLIIL("tns_br_election_share_prompt", c2344009Gk.LIZ);
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
    public final boolean LIZJ(Context context, Aweme aweme, Bundle bundle, Function0<Unit> function0) {
        KtfInfo ktfInfo;
        String str;
        String str2;
        String str3;
        String str4;
        new Object() { // from class: X.0zsF
        }.getClass();
        if (aweme != null) {
            String string = bundle.getString("channel_key");
            String str5 = "";
            if (string == null) {
                string = "";
            }
            if (!TextUtils.equals("download", string) && (ktfInfo = AwemeExtKt.getUploadMiscInfoStruct(aweme).ktfInfo) != null && ktfInfo.showMessageOnShare && !ktfInfo.hasShowOnce) {
                ktfInfo.setHasShowOnce(true);
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_triangle_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c1397580mTM.LJIIIZ = new C340190DVh(0, context, c419910GdJ.LIZ(context));
                c1397580mTM.LJII = false;
                String string2 = ktfInfo.titleTextOnShare;
                if (string2 == null) {
                    string2 = context.getString(2131836375);
                }
                c1397580mTM.LJI(string2);
                c1397580mTM.LIZIZ(ktfInfo.messageTextOnShare);
                C1238130iKB.LIZ(c1397580mTM, new AwS368S0200000_2(aweme, (Aweme) function0, (Function0<Unit>) 78));
                KtfLinkOnShare ktfLinkOnShare = ktfInfo.linkOnShare;
                if (ktfLinkOnShare != null) {
                    str = ktfLinkOnShare.text;
                } else {
                    str = null;
                }
                if (C123100dR.LIZ(str)) {
                    KtfLinkOnShare ktfLinkOnShare2 = ktfInfo.linkOnShare;
                    if (ktfLinkOnShare2 != null) {
                        str3 = ktfLinkOnShare2.url;
                    } else {
                        str3 = null;
                    }
                    if (C123100dR.LIZ(str3)) {
                        View viewSd = C786410Ut5.Sd(R.layout.bcf, C786410Ut5.ne(context), null);
                        C444940Hca c444940Hca = new C444940Hca();
                        KtfLinkOnShare ktfLinkOnShare3 = ktfInfo.linkOnShare;
                        if (ktfLinkOnShare3 != null && (str4 = ktfLinkOnShare3.text) != null) {
                            str5 = str4;
                        }
                        c444940Hca.LIZJ = str5;
                        c444940Hca.LIZLLL(0);
                        c444940Hca.LIZIZ(102);
                        c444940Hca.LIZIZ = true;
                        c444940Hca.LJIIIIZZ = new AwS422S0200000_21(ktfInfo, context, 72);
                        ((TextView) viewSd.findViewById(R.id.y3j)).setText(c444940Hca.LIZ(context));
                        ((TextView) viewSd.findViewById(R.id.y3j)).setMovementMethod(C431260Gvc.LIZ);
                        C384000F3u.LIZ(c1397580mTM, viewSd);
                    }
                }
                new C1397510mTF(c1397580mTM).LIZLLL();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("object_id", aweme.getAid());
                if (!TextUtils.isEmpty(string) && !TextUtils.equals(string, "chat_merge")) {
                    str2 = "share_to";
                } else {
                    str2 = "send_to";
                }
                c2344009Gk.LJIIIIZZ("type", str2);
                C20684815ws.LJIILLIIL("tns_share_warning_popout_ktf", c2344009Gk.LIZ);
                return true;
            }
        }
        return false;
    }
}
