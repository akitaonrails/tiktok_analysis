package kotlin.jvm.internal;

import X.C01GW;
import X.C06R7;
import X.C09AY;
import X.C1509305vX;
import X.C1558360qeg;
import X.C1558520qew;
import X.C631230OpN;
import X.C632070Oqj;
import X.C638950P4j;
import X.C724240Sb0;
import X.InterfaceC904700ZeO;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS16S0300000_9;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarFavoriteVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility;
import com.ss.android.ugc.aweme.im.scrolltobottomindicator.ScrollToBottomIndicator;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS287S0300000_9 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS287S0300000_9 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            boolean r0 = r7 instanceof X.C614080O6s
            r4 = 0
            if (r0 == 0) goto L74
            X.0O6s r7 = (X.C614080O6s) r7
            if (r7 == 0) goto L75
            java.lang.Throwable r1 = r7.getE()
        Lf:
            boolean r0 = r1 instanceof X.C0XIR
            if (r0 == 0) goto L71
            X.093u r1 = (X.C23112093u) r1
            if (r1 == 0) goto L71
            int r0 = r1.getErrorCode()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "api"
        L21:
            if (r7 == 0) goto L6f
            java.lang.Throwable r1 = r7.getE()
        L27:
            boolean r0 = r1 instanceof X.C1494690ozz
            if (r0 == 0) goto L39
            X.0ozz r1 = (X.C1494690ozz) r1
            if (r1 == 0) goto L39
            int r0 = r1.getCronetInternalErrorCode()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "net"
        L39:
            X.0O8a r1 = new X.0O8a
            r1.<init>()
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = (com.ss.android.ugc.aweme.comment.model.CommentContextSource) r0
            if (r0 == 0) goto L6d
            java.lang.String r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.enterFrom(r0)
        L48:
            r1.LIZLLL = r0
            java.lang.String r0 = "click_fav_button"
            r1.LJIILLIIL = r0
            r1.LJIIZILJ = r3
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarFavoriteVM r0 = (com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarFavoriteVM) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LL
            if (r0 == 0) goto L5c
            java.lang.String r4 = r0.getAid()
        L5c:
            r1.LJIJI = r4
            r1.LJIJ = r2
            r1.LJIILJJIL()
            java.lang.Object r0 = r5.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6d:
            r0 = r4
            goto L48
        L6f:
            r1 = r4
            goto L27
        L71:
            r3 = r4
            r2 = r4
            goto L21
        L74:
            r7 = r4
        L75:
            r1 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS287S0300000_9.invoke$0(kotlin.jvm.internal.AwS287S0300000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS287S0300000_9 awS287S0300000_9, Object obj, Object obj2) {
        MessageListLongPressAbility messageListLongPressAbility;
        UIContentAssem uIContentAssem = (UIContentAssem) obj;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) obj2;
        C01GW c01gwLIZ = C1509305vX.LIZ(new AwS553S0100000_9(uIContentAssem, 174));
        C01GW c01gwLIZ2 = C1509305vX.LIZ(new AwS546S0100000_2(uIContentAssem, 444));
        View view = (View) awS287S0300000_9.l0;
        C06R7 c06r7 = (C06R7) ((C01GW) awS287S0300000_9.l2).getValue();
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c01gwLIZ, 175);
        AwS143S0400000_14 awS143S0400000_14 = new AwS143S0400000_14(uIContentAssem, (UIContentAssem) viewOnAttachStateChangeListenerC20604515jv, (ViewOnAttachStateChangeListenerC20604515jv) c01gwLIZ, (C01GW<? extends InterfaceC904700ZeO>) c01gwLIZ2, (C01GW<? extends ChatroomEventAbility>) 0);
        Fragment fragmentLJI = C724240Sb0.LJI(uIContentAssem);
        if (fragmentLJI != null && (messageListLongPressAbility = (MessageListLongPressAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), MessageListLongPressAbility.class, null)) != null) {
            ScrollToBottomIndicator scrollToBottomIndicator = new ScrollToBottomIndicator(view, viewOnAttachStateChangeListenerC20604515jv, c06r7, awS553S0100000_9, awS143S0400000_14, new C638950P4j(messageListLongPressAbility.gg2(), 1), (SessionInfo) awS287S0300000_9.l1);
            uIContentAssem.getLifecycle().addObserver(scrollToBottomIndicator);
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS16S0300000_9(viewOnAttachStateChangeListenerC20604515jv, scrollToBottomIndicator, c01gwLIZ, 1));
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$2(AwS287S0300000_9 awS287S0300000_9, Object obj, Object obj2) {
        List list = (List) obj2;
        if (list != null && !list.isEmpty()) {
            C631230OpN.LIZJ((View) awS287S0300000_9.l0);
            if (((OriginMusicListViewModel) awS287S0300000_9.l1).LLJ) {
                C632070Oqj.LIZLLL(((User) awS287S0300000_9.l2).getSecUid());
            }
        } else {
            C631230OpN.LIZ((View) awS287S0300000_9.l0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS287S0300000_9(View view, View view2, SessionInfo sessionInfo, C01GW<C06R7> c01gw) {
        super(2);
        this.$t = c01gw;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS287S0300000_9(View view, OriginMusicListViewModel originMusicListViewModel, User user, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = originMusicListViewModel;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS287S0300000_9(CommentContextSource commentContextSource, TitlePanelBottomBarFavoriteVM titlePanelBottomBarFavoriteVM, AwS53S0010000_9 awS53S0010000_9, int i) {
        super(2);
        this.$t = i;
        this.l0 = commentContextSource;
        this.l1 = titlePanelBottomBarFavoriteVM;
        this.l2 = awS53S0010000_9;
    }
}
