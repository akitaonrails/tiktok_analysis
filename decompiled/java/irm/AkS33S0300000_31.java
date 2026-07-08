package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C20610815kw;
import X.C20611915l7;
import X.C316580Cb2;
import android.view.View;
import com.ss.android.ugc.aweme.business.caption.cell.TextCaptionMentionCell;
import com.ss.android.ugc.aweme.business.sticker.cell.MentionStickerCell;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class AkS33S0300000_31 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS33S0300000_31 akS33S0300000_31, View view) {
        String str;
        C20610815kw c20610815kw = C20610815kw.LIZ;
        String str2 = (String) ((Map) akS33S0300000_31.l0).get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = (String) ((Map) akS33S0300000_31.l0).get("previous_page");
        if (str4 == null) {
            str4 = "";
        }
        C20611915l7 c20611915l7 = ((C316580Cb2) akS33S0300000_31.l1).LL;
        String strWQ2 = ((TextCaptionMentionCell) akS33S0300000_31.l2).N5().wQ2();
        String str5 = (String) ((Map) akS33S0300000_31.l0).get("shoot_way");
        String str6 = (String) ((Map) akS33S0300000_31.l0).get("content_source");
        String str7 = (String) ((Map) akS33S0300000_31.l0).get("content_type");
        String str8 = (String) ((Map) akS33S0300000_31.l0).get("is_note");
        c20610815kw.getClass();
        C20610815kw.LJ(c20611915l7, str2, str4, "sticker_mention", strWQ2, str5, str6, str7, str8, true);
        C20611915l7 c20611915l72 = ((C316580Cb2) akS33S0300000_31.l1).LL;
        String str9 = (String) ((Map) akS33S0300000_31.l0).get("enter_from");
        if (str9 != null) {
            str3 = str9;
        }
        C20610815kw.LIZJ(c20611915l72, str3, ((TextCaptionMentionCell) akS33S0300000_31.l2).N5().wQ2(), (String) ((Map) akS33S0300000_31.l0).get("shoot_way"), (String) ((Map) akS33S0300000_31.l0).get("content_source"), (String) ((Map) akS33S0300000_31.l0).get("content_type"));
        if (Intrinsics.LJFF(((Map) akS33S0300000_31.l0).get("is_note"), "1")) {
            str = "story_note_mention";
        } else {
            str = "text_mention";
        }
        ((TextCaptionMentionCell) akS33S0300000_31.l2).R5(((C316580Cb2) akS33S0300000_31.l1).LL, str);
        ((TextCaptionMentionCell) akS33S0300000_31.l2).N5().xQ2(((C316580Cb2) akS33S0300000_31.l1).LL, ((TextCaptionMentionCell) akS33S0300000_31.l2).getBindingAdapterPosition(), true);
    }

    public static final void LIZ$1(AkS33S0300000_31 akS33S0300000_31, View view) {
        C20610815kw c20610815kw = C20610815kw.LIZ;
        String str = (String) ((Map) akS33S0300000_31.l0).get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) ((Map) akS33S0300000_31.l0).get("previous_page");
        if (str3 == null) {
            str3 = "";
        }
        C20611915l7 c20611915l7 = ((C316580Cb2) akS33S0300000_31.l1).LL;
        String strWQ2 = ((MentionStickerCell) akS33S0300000_31.l2).N5().wQ2();
        String str4 = (String) ((Map) akS33S0300000_31.l0).get("shoot_way");
        String str5 = (String) ((Map) akS33S0300000_31.l0).get("content_source");
        String str6 = (String) ((Map) akS33S0300000_31.l0).get("content_type");
        c20610815kw.getClass();
        C20610815kw.LJ(c20611915l7, str, str3, "sticker_mention", strWQ2, str4, str5, str6, null, true);
        C20611915l7 c20611915l72 = ((C316580Cb2) akS33S0300000_31.l1).LL;
        String str7 = (String) ((Map) akS33S0300000_31.l0).get("enter_from");
        if (str7 != null) {
            str2 = str7;
        }
        C20610815kw.LIZJ(c20611915l72, str2, ((MentionStickerCell) akS33S0300000_31.l2).N5().wQ2(), (String) ((Map) akS33S0300000_31.l0).get("shoot_way"), (String) ((Map) akS33S0300000_31.l0).get("content_source"), (String) ((Map) akS33S0300000_31.l0).get("content_type"));
        ((MentionStickerCell) akS33S0300000_31.l2).R5(((C316580Cb2) akS33S0300000_31.l1).LL, "sticker_mention");
        ((MentionStickerCell) akS33S0300000_31.l2).N5().xQ2(((C316580Cb2) akS33S0300000_31.l1).LL, ((MentionStickerCell) akS33S0300000_31.l2).getBindingAdapterPosition(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(irm.AkS33S0300000_31 r6, android.view.View r7) {
        /*
            java.lang.Object r0 = r6.l0
            X.16CE r0 = (X.C16CE) r0
            com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel r0 = r0.LLILZLL
            if (r0 == 0) goto L60
            int r0 = r0.selectIndex
        La:
            r5 = 0
            if (r0 >= 0) goto L5e
            java.lang.Object r2 = r6.l1
            X.16CD r2 = (X.C16CD) r2
            java.util.ArrayList<com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel> r0 = r2.LLILLL
            int r1 = r0.size()
            int r0 = r2.LLILLJJLI
            r2 = 1
            if (r1 < r0) goto L5e
        L1c:
            java.lang.Object r0 = r6.l1
            X.16CD r0 = (X.C16CD) r0
            X.16CC r1 = r0.LLILZIL
            if (r1 == 0) goto L55
            if (r2 != 0) goto L55
            java.lang.Object r0 = r6.l0
            X.16CE r0 = (X.C16CE) r0
            com.bytedance.lighten.loader.SmartImageView r4 = r0.LL
            java.lang.Object r3 = r6.l2
            com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel r3 = (com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel) r3
            X.16C4 r2 = r1.LIZ
            r2.getClass()
            if (r3 == 0) goto L55
            java.lang.String r0 = r3.LJFF()
            boolean r1 = X.C531320Ksc.LIZIZ(r0, r5)
            android.app.Activity r0 = r2.mActivity
            if (r0 == 0) goto L55
            if (r1 != 0) goto L56
            if (r4 == 0) goto L55
            X.0mGx r1 = new X.0mGx
            r1.<init>(r4)
            r0 = 2131839855(0x7f114b6f, float:1.9312973E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
        L55:
            return
        L56:
            X.16CH r0 = r2.LLJJIII
            if (r0 == 0) goto L55
            r0.LIZIZ(r3, r4)
            return
        L5e:
            r2 = 0
            goto L1c
        L60:
            r0 = -1
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS33S0300000_31.LIZ$2(irm.AkS33S0300000_31, android.view.View):void");
    }

    public AkS33S0300000_31(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
