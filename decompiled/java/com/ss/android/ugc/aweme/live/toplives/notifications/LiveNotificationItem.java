package com.ss.android.ugc.aweme.live.toplives.notifications;

import X.C0160003a;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C054G;
import X.C0IJT;
import X.C13LE;
import X.C1548820qPI;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C452080Ho6;
import X.C452501pT;
import X.C474500IjA;
import X.C484430IzB;
import X.C484460IzE;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.NoticeButton;
import webcast.api.feed.NoticeItem;
import webcast.api.feed.NoticeUIInfo;
import webcast.api.feed.NoticeUserStruct;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNotificationItem extends PowerCell<C0160003a> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public NoticeItem LLJILJIL;
    public C054G LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveNotificationItem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/toplives/notifications/vm/LiveNotificationListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveNotificationItem() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveNotificationListViewModel.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 356);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(114);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS551S0100000_7(c19719912DlLIZ, 337), awS551S0100000_7, AFwS193S0000000_7.get$arr$(157), new AwS551S0100000_7((C03K6) this, 340), new AwS551S0100000_7((C03K6) this, 342), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 344), aFwS237S0000000_7, new AwS551S0100000_7((C03K6) this, 346), null, new AwS551S0100000_7((C03K6) this, 347));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS551S0100000_7 awS551S0100000_72 = new AwS551S0100000_7((C03K6) this, 341);
            AwS551S0100000_7 awS551S0100000_73 = new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 343);
            AwS551S0100000_7 awS551S0100000_74 = new AwS551S0100000_7(c19719912DlLIZ, 345);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS408S0200000_7((InterfaceC451590HnJ) obj, awS551S0100000_72, 22));
            AwS551S0100000_7 awS551S0100000_75 = new AwS551S0100000_7(c01gwLIZIZ, 348);
            AwS551S0100000_7 awS551S0100000_76 = new AwS551S0100000_7(c01gwLIZIZ, 350);
            AwS551S0100000_7 awS551S0100000_77 = new AwS551S0100000_7(c01gwLIZIZ, 352);
            AwS551S0100000_7 awS551S0100000_78 = new AwS551S0100000_7(c01gwLIZIZ, 353);
            AwS551S0100000_7 awS551S0100000_79 = new AwS551S0100000_7(c01gwLIZIZ, 354);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS551S0100000_74, awS551S0100000_7, new C452080Ho6(), awS551S0100000_75, awS551S0100000_76, awS551S0100000_73, aFwS237S0000000_7, awS551S0100000_77, awS551S0100000_78, awS551S0100000_79);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS551S0100000_7(c19719912DlLIZ, 355), awS551S0100000_7, AFwS193S0000000_7.get$arr$(158), new AwS551S0100000_7((C03K6) this, 357), new AwS551S0100000_7((C03K6) this, 358), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 359), aFwS237S0000000_7, new AwS551S0100000_7((C03K6) this, 360), null, new AwS551S0100000_7((C03K6) this, 361));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS551S0100000_7(c19719912DlLIZ, 362), awS551S0100000_7, AFwS193S0000000_7.get$arr$(156), new AwS551S0100000_7((C03K6) this, 328), new AwS551S0100000_7((C03K6) this, 330), new AwS551S0100000_7((C03K6) this, 333), aFwS237S0000000_7, null, null, new AwS551S0100000_7((C03K6) this, 335));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 334));
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 332));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 339));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 351));
        this.LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 336));
        this.LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 327));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 331));
        this.LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 329));
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 338));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 349));
    }

    public final TextView I5() {
        return (TextView) this.LLJI.getValue();
    }

    public final C484430IzB L5() {
        return (C484430IzB) this.LLILZ.getValue();
    }

    public final int gl() {
        Integer numValueOf = Integer.valueOf(getBindingAdapterPosition());
        if (numValueOf.intValue() >= 0) {
            return numValueOf.intValue() + 1;
        }
        return -1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C484430IzB c484430IzBL5 = L5();
        c484430IzBL5.getClass();
        C1548820qPI.LJIIIIZZ("live_event_update_result", c484430IzBL5);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        NoticeUIInfo noticeUIInfo;
        NoticeButton noticeButton;
        NoticeUIInfo noticeUIInfo2;
        List<NoticeUserStruct> list;
        NoticeUIInfo noticeUIInfo3;
        List<NoticeUserStruct> list2;
        NoticeUserStruct noticeUserStruct;
        super.onViewAttachedToWindow();
        C484460IzE.LIZLLL("show", null, gl(), this.LLJILJIL, null);
        NoticeItem noticeItem = this.LLJILJIL;
        if ((noticeItem == null || (noticeUIInfo3 = noticeItem.showUiInfo) == null || (list2 = noticeUIInfo3.fromUserList) == null || !(list2.isEmpty() ^ true) || (noticeUserStruct = (NoticeUserStruct) ListProtector.get(list2, 0)) == null || !noticeUserStruct.isLiving) ? false : true) {
            NoticeItem noticeItem2 = this.LLJILJIL;
            NoticeUserStruct noticeUserStruct2 = (noticeItem2 == null || (noticeUIInfo2 = noticeItem2.showUiInfo) == null || (list = noticeUIInfo2.fromUserList) == null || !(list.isEmpty() ^ true)) ? null : (NoticeUserStruct) ListProtector.get(list, 0);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
            c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
            c474500IjALIZ.LJJII("live_activity_notification_message_head", "enter_method");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII(Long.valueOf(noticeItem2 != null ? noticeItem2.anchorId : 0L), "anchor_id");
            c474500IjALIZ.LJJII(noticeItem2 != null ? Long.valueOf(noticeItem2.roomId) : null, "room_id");
            c474500IjALIZ.LJJII(noticeUserStruct2 != null ? Long.valueOf(noticeUserStruct2.followStatus) : null, "follow_status");
            c474500IjALIZ.LIZ();
        }
        NoticeItem noticeItem3 = this.LLJILJIL;
        if (noticeItem3 == null || (noticeUIInfo = noticeItem3.showUiInfo) == null || (noticeButton = noticeUIInfo.button) == null || noticeButton.buttonType != 3) {
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_entrance_show");
        c474500IjALIZ2.LJJII("live_merge", "enter_from_merge");
        c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ2.LJJII("live_activity_notification_message_button", "live_entrance_name");
        c474500IjALIZ2.LJJII("click", "action_type");
        c474500IjALIZ2.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C054G c054g = this.LLJILJILJ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        this.LLJILJILJ = null;
        C484430IzB c484430IzBL5 = L5();
        c484430IzBL5.getClass();
        C1548820qPI.LJIIIIZZ("live_event_update_result", c484430IzBL5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0424  */
    /* JADX WARN: Type inference failed for: r2v76, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.CharSequence] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r25, java.util.List r26) {
        /*
            Method dump skipped, instruction units count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem.onBindItemView(X.0zJl, java.util.List):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.hfj, false, 4, null);
    }
}
