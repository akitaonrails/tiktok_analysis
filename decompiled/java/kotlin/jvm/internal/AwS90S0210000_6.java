package kotlin.jvm.internal;

import X.C09AY;
import X.C0HXV;
import X.C0I5L;
import X.C0I98;
import X.C1360520lVa;
import X.C197039127h;
import X.C418040GaI;
import X.C454440Hru;
import android.content.Context;
import android.text.Layout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot;
import com.ss.android.ugc.aweme.msg.GroupInvitationCardAssem;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.RelatedSearchWordCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS90S0210000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS90S0210000_6 awS90S0210000_6) {
        UrlModel urlModelLJIILIIL;
        String str;
        String string;
        String inviterName;
        GroupInfo group;
        GroupInfo group2;
        String str2;
        RemoteImageView remoteImageView = (RemoteImageView) ((GroupInvitationCardAssem) awS90S0210000_6.l0).LLJLIL.getValue();
        GroupInviteCardContent groupInviteCardContent = (GroupInviteCardContent) awS90S0210000_6.l1;
        if (groupInviteCardContent != null && (group2 = groupInviteCardContent.getGroup()) != null && (str2 = group2.avatarUrl) != null) {
            urlModelLJIILIIL = C0I98.LJIILIIL(str2);
        } else {
            urlModelLJIILIIL = null;
        }
        C0I5L.LIZ(remoteImageView, urlModelLJIILIIL, "GroupInvitationCardAssem", C454440Hru.LIZ(), ((GroupInvitationCardAssem) awS90S0210000_6.l0).LLL);
        TextView textView = (TextView) ((GroupInvitationCardAssem) awS90S0210000_6.l0).LLJLILLLLZIIL.getValue();
        C1360520lVa c1360520lVa = new C1360520lVa();
        GroupInviteCardContent groupInviteCardContent2 = (GroupInviteCardContent) awS90S0210000_6.l1;
        String str3 = "";
        if (groupInviteCardContent2 == null || (group = groupInviteCardContent2.getGroup()) == null || (str = group.name) == null) {
            str = "";
        }
        c1360520lVa.LIZ.append((CharSequence) str);
        textView.setText(c1360520lVa.LIZ);
        TextView textView2 = (TextView) ((GroupInvitationCardAssem) awS90S0210000_6.l0).LLJLL.getValue();
        Context context = ((GroupInvitationCardAssem) awS90S0210000_6.l0).getContentView().getContext();
        Object[] objArr = new Object[1];
        GroupInviteCardContent groupInviteCardContent3 = (GroupInviteCardContent) awS90S0210000_6.l1;
        if (groupInviteCardContent3 != null && (inviterName = groupInviteCardContent3.getInviterName()) != null) {
            str3 = inviterName;
        }
        objArr[0] = str3;
        textView2.setText(context.getString(2131827489, objArr));
        C197039127h c197039127hSp = ((GroupInvitationCardAssem) awS90S0210000_6.l0).sp();
        if (awS90S0210000_6.z2) {
            string = ((GroupInvitationCardAssem) awS90S0210000_6.l0).sp().getContext().getString(2131827487);
        } else {
            string = ((GroupInvitationCardAssem) awS90S0210000_6.l0).sp().getContext().getString(2131827488);
        }
        c197039127hSp.setText(string);
        ((GroupInvitationCardAssem) awS90S0210000_6.l0).sp().setTuxFont(42);
        ((GroupInvitationCardAssem) awS90S0210000_6.l0).sp().LJJJJL(new AwS585S0100000_6((GroupInvitationCardAssem) awS90S0210000_6.l0, 247));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS90S0210000_6 r3) {
        /*
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot) r0
            r0.sp()
            boolean r0 = r3.z2
            r2 = 0
            if (r0 != 0) goto L20
            java.lang.Object r1 = r3.l1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r0 = r1 instanceof X.C1494690ozz
            if (r0 == 0) goto L39
            X.0ozz r1 = (X.C1494690ozz) r1
            if (r1 == 0) goto L39
            int r1 = r1.getStatusCode()
            r0 = 403(0x193, float:5.65E-43)
            if (r1 != r0) goto L39
        L20:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r2)
            com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager r1 = r0.getMessageRefreshManager()
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot) r0
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            X.0I7k r0 = (X.InterfaceC461380I7k) r0
            X.0Y9l r0 = X.C0I6Y.LIZ(r0)
            r1.LIZLLL(r0)
        L39:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS90S0210000_6.invoke$1(kotlin.jvm.internal.AwS90S0210000_6):java.lang.Object");
    }

    public static final Object invoke$2(AwS90S0210000_6 awS90S0210000_6) {
        int lineCount;
        float fLIZ;
        Layout layout;
        TuxTextView tuxTextView = (TuxTextView) awS90S0210000_6.l0;
        if (tuxTextView != null && (layout = tuxTextView.getLayout()) != null) {
            lineCount = layout.getLineCount();
        } else {
            lineCount = 1;
        }
        if (lineCount > 1) {
            if (awS90S0210000_6.z2) {
                fLIZ = C418040GaI.LIZ(10);
            } else {
                fLIZ = C418040GaI.LIZ(12);
            }
        } else if (awS90S0210000_6.z2) {
            fLIZ = C418040GaI.LIZ(12);
        } else {
            fLIZ = C418040GaI.LIZ(16);
        }
        int i = (int) fLIZ;
        C0HXV.LJFF(i, ((RelatedSearchWordCell) awS90S0210000_6.l1).itemView);
        C0HXV.LIZJ(i, ((RelatedSearchWordCell) awS90S0210000_6.l1).itemView);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0210000_6(TuxTextView tuxTextView, boolean z, RelatedSearchWordCell relatedSearchWordCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = tuxTextView;
        this.z2 = z;
        this.l1 = relatedSearchWordCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0210000_6(StoreStickerCardReusedUISlot storeStickerCardReusedUISlot, boolean z, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = storeStickerCardReusedUISlot;
        this.z2 = z;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0210000_6(GroupInvitationCardAssem groupInvitationCardAssem, GroupInviteCardContent groupInviteCardContent, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = groupInvitationCardAssem;
        this.l1 = groupInviteCardContent;
        this.z2 = z;
    }
}
