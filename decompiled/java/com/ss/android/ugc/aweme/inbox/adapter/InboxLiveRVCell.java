package com.ss.android.ugc.aweme.inbox.adapter;

import X.C0IVT;
import X.C0IYA;
import X.C0J5O;
import X.C1243240iSQ;
import X.C1387040mCM;
import X.C1598180rgu;
import X.C1605490rsh;
import X.C1607400rvm;
import X.C1607440rvq;
import X.C1607450rvr;
import X.C1607480rvu;
import X.C1610770s1D;
import X.C2097608Jq;
import X.C21569819bE;
import X.C295190Bhd;
import X.C418440Gaw;
import X.C424700Gl2;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.InterfaceC20673515v3;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxLiveRVCell extends InboxLiveBaseCell<C1598180rgu> {
    public C424700Gl2 LLJJIII;
    public TextView LLJJIJI;
    public C1610770s1D LLJJIJIIJIL;

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("head_type", "live_single_head"));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ct1;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        TextView textView = this.LLJJIJI;
        if (textView == null) {
            return null;
        }
        return textView;
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    public final void U5() {
        C21569819bE c21569819bE = this.LLILLL;
        if (c21569819bE != null) {
            c21569819bE.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    public final void b6() {
        C21569819bE c21569819bE = this.LLILLL;
        if (c21569819bE != null) {
            c21569819bE.LJFF();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        InboxLiveNotice inboxLiveNotice;
        C1598180rgu c1598180rgu = (C1598180rgu) getItem();
        if (c1598180rgu == null || (inboxLiveNotice = c1598180rgu.LLILLL) == null) {
            return null;
        }
        return inboxLiveNotice.user;
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell, com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLJJIII = (C424700Gl2) this.itemView.findViewById(R.id.kj2);
        this.LLJJIJI = (TextView) this.itemView.findViewById(R.id.kkf);
        this.LLJJIJIIJIL = (C1610770s1D) this.itemView.findViewById(R.id.kj3);
        C21569819bE c21569819bE = (C21569819bE) this.itemView.findViewById(R.id.n9n);
        this.LLILLL = c21569819bE;
        V5(c21569819bE != null ? c21569819bE.getContext() : null);
        this.LLILZ = (RelationButton) this.itemView.findViewById(R.id.t4m);
        C1610770s1D c1610770s1D = this.LLJJIJIIJIL;
        if (c1610770s1D == null) {
            c1610770s1D = null;
        }
        c1610770s1D.setStrokeWidth((int) Math.floor(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
        c1610770s1D.setInnerStrokeWidth((int) Math.floor(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
        View view = this.itemView;
        C1610770s1D c1610770s1D2 = this.LLJJIJIIJIL;
        if (c1610770s1D2 == null) {
            c1610770s1D2 = null;
        }
        C424700Gl2 c424700Gl2 = this.LLJJIII;
        if (c424700Gl2 == null) {
            c424700Gl2 = null;
        }
        TextView textView = this.LLJJIJI;
        if (textView == null) {
            textView = null;
        }
        C1607400rvm.LIZIZ.LIZLLL(new C1607440rvq(view, c1610770s1D2, c424700Gl2, textView, (View) null, 48), EnumC1606080rte.INBOX_TOP_LIST, C295190Bhd.LIZIZ());
        C21569819bE c21569819bE2 = this.LLILLL;
        if (c21569819bE2 != null) {
            float fLIZIZ = C418440Gaw.LIZIZ(3);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21569819bE2);
            c21569819bE2.setTranslationY(fLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.MUTE_LIVES;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return this.itemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(java.lang.Long r17) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.adapter.InboxLiveRVCell.X5(java.lang.Long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: d6, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1598180rgu c1598180rgu) {
        SlimRoom slimRoom;
        C0J5O c0j5oZ5;
        InboxLiveNotice inboxLiveNotice;
        C21569819bE c21569819bE;
        User user;
        final UrlModel avatarThumb;
        List<String> urlList;
        UrlModel avatarMedium;
        List<String> urlList2;
        super.onBindItemView(c1598180rgu);
        InboxLiveNotice inboxLiveNotice2 = c1598180rgu.LLILLL;
        SlimRoom slimRoom2 = null;
        if (inboxLiveNotice2 != null && (user = inboxLiveNotice2.user) != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (OptAvatarLargeUseSetting.INSTANCE.v2() && (avatarMedium = user.getAvatarMedium()) != null && (urlList2 = avatarMedium.getUrlList()) != null && !urlList2.isEmpty()) {
                avatarThumb = user.getAvatarMedium();
            } else {
                avatarThumb = user.getAvatarThumb();
            }
            if (avatarThumb != null) {
                urlList = avatarThumb.getUrlList();
            } else {
                urlList = null;
            }
            C424700Gl2 c424700Gl2 = this.LLJJIII;
            if (c424700Gl2 == null) {
                c424700Gl2 = null;
            }
            W5(urlList, c424700Gl2, new C0IYA() { // from class: X.0rvn
                @Override // X.C0IYA, X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str) {
                    UrlModel urlModel = avatarThumb;
                    if (urlModel != null) {
                        long j = jCurrentTimeMillis;
                        C1890800zIs.LIZIZ(System.currentTimeMillis() - j, urlModel.getUri(), "inbox-skylight-avatar");
                    }
                }
            });
            C1243240iSQ.LIZ.getClass();
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            TextView textView = this.LLJJIJI;
            if (textView == null) {
                textView = null;
            }
            textView.setText(nickname);
            C1387040mCM.LIZ(this.itemView, new AwS127S1000000_24(nickname, 1));
        }
        if (this.LLILLJJLI && C1605490rsh.LIZJ.LIZ == 0 && (c21569819bE = this.LLILLL) != null) {
            c21569819bE.LJFF();
        }
        if (C1607450rvr.LIZ().presetRoomInfo) {
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            C1598180rgu c1598180rgu2 = (C1598180rgu) getItem();
            if (c1598180rgu2 != null && (inboxLiveNotice = c1598180rgu2.LLILLL) != null) {
                slimRoom2 = inboxLiveNotice.roomInfo;
            }
            interfaceC20673515v3K4.T8(C0IVT.LIZ("message", "live_cover", slimRoom2));
        }
        if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableInboxHead && getAbsoluteAdapterPosition() == 1) {
            InboxLiveNotice inboxLiveNotice3 = c1598180rgu.LLILLL;
            if (inboxLiveNotice3 != null && (slimRoom = inboxLiveNotice3.roomInfo) != null) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
                    c0j5oZ5.LJ(this.itemView.getContext(), slimRoom, "message");
                }
            } else {
                return;
            }
        }
        T5();
    }
}
