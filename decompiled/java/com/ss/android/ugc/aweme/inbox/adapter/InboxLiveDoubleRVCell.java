package com.ss.android.ugc.aweme.inbox.adapter;

import X.C0IVT;
import X.C0IYA;
import X.C0J5O;
import X.C1243240iSQ;
import X.C1324720kZq;
import X.C1387040mCM;
import X.C1598190rgv;
import X.C1605490rsh;
import X.C1607400rvm;
import X.C1607450rvr;
import X.C1607480rvu;
import X.C1608370rxL;
import X.C1610770s1D;
import X.C2097608Jq;
import X.C21569819bE;
import X.C2188811AlT;
import X.C295190Bhd;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.InterfaceC20673515v3;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
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
public final class InboxLiveDoubleRVCell extends InboxLiveBaseCell<C1598190rgv> {
    public C1324720kZq LLJJIII;
    public C1324720kZq LLJJIJI;
    public TextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public TextView LLJJJ;
    public C1610770s1D LLJJJIL;
    public C1610770s1D LLJJJJ;

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("head_type", "live_heads"));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ct0;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        TextView textView = this.LLJJIJIIJIL;
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
        C1598190rgv c1598190rgv = (C1598190rgv) getItem();
        if (c1598190rgv == null || (inboxLiveNotice = c1598190rgv.LLILLL) == null) {
            return null;
        }
        return inboxLiveNotice.user;
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell, com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLJJIII = (C1324720kZq) this.itemView.findViewById(R.id.ldr);
        this.LLJJIJI = (C1324720kZq) this.itemView.findViewById(R.id.ldd);
        this.LLJJIJIIJIL = (TextView) this.itemView.findViewById(R.id.zym);
        this.LLJJIJIL = this.itemView.findViewById(R.id.p0e);
        this.LLJJJ = (TextView) this.itemView.findViewById(R.id.tv_plus);
        this.LLJJJIL = (C1610770s1D) this.itemView.findViewById(R.id.ln4);
        this.LLJJJJ = (C1610770s1D) this.itemView.findViewById(R.id.f743ln3);
        C21569819bE c21569819bE = (C21569819bE) this.itemView.findViewById(R.id.n9n);
        this.LLILLL = c21569819bE;
        V5(c21569819bE != null ? c21569819bE.getContext() : null);
        this.LLILZ = (RelationButton) this.itemView.findViewById(R.id.t4m);
        View viewFindViewById = this.itemView.findViewById(R.id.l_z);
        View viewFindViewById2 = this.itemView.findViewById(R.id.l_w);
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        View view = this.itemView;
        C1610770s1D c1610770s1D = this.LLJJJIL;
        if (c1610770s1D == null) {
            c1610770s1D = null;
        }
        C1610770s1D c1610770s1D2 = this.LLJJJJ;
        if (c1610770s1D2 == null) {
            c1610770s1D2 = null;
        }
        C1324720kZq c1324720kZq = this.LLJJIII;
        if (c1324720kZq == null) {
            c1324720kZq = null;
        }
        C1324720kZq c1324720kZq2 = this.LLJJIJI;
        if (c1324720kZq2 == null) {
            c1324720kZq2 = null;
        }
        TextView textView = this.LLJJIJIIJIL;
        if (textView == null) {
            textView = null;
        }
        TextView textView2 = this.LLJJJ;
        if (textView2 == null) {
            textView2 = null;
        }
        c1607400rvm.LIZ(new C1608370rxL(view, c1610770s1D, viewFindViewById, c1324720kZq, c1610770s1D2, viewFindViewById2, c1324720kZq2, textView, textView2, (View) null, 1536), EnumC1606080rte.INBOX_TOP_LIST, C295190Bhd.LIZIZ());
        C1610770s1D c1610770s1D3 = this.LLJJJIL;
        if (c1610770s1D3 == null) {
            c1610770s1D3 = null;
        }
        c1610770s1D3.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        c1610770s1D3.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        C1610770s1D c1610770s1D4 = this.LLJJJJ;
        C1610770s1D c1610770s1D5 = c1610770s1D4 != null ? c1610770s1D4 : null;
        c1610770s1D5.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        c1610770s1D5.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
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
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(java.lang.Long r29) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.adapter.InboxLiveDoubleRVCell.X5(java.lang.Long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: d6, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1598190rgv c1598190rgv) {
        SlimRoom slimRoom;
        ILiveOuterService iLiveOuterService;
        C0J5O c0j5oZ5;
        InboxLiveNotice inboxLiveNotice;
        C21569819bE c21569819bE;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user;
        List urls;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user2;
        List urls2;
        super.onBindItemView(c1598190rgv);
        InboxLiveNotice inboxLiveNotice2 = c1598190rgv.LLILLL;
        if (inboxLiveNotice2 != null && (slimRoom = inboxLiveNotice2.roomInfo) != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C0IYA c0iya = new C0IYA() { // from class: X.0rvo
                @Override // X.C0IYA, X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str) {
                    if (str != null) {
                        C1890800zIs.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, str, "inbox-skylight-avatar");
                    }
                }
            };
            int i = 0;
            SlimRoom slimRoom2 = null;
            if (slimRoom.getLinkMic().followedList.size() >= 2) {
                SlimRoom.LinkMic linkMic = slimRoom.getLinkMic();
                if (linkMic != null && (list2 = linkMic.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) != null) {
                    ImageModel avatarThumb = user2.getAvatarThumb();
                    if (avatarThumb != null) {
                        urls2 = avatarThumb.getUrls();
                    } else {
                        urls2 = null;
                    }
                    C1324720kZq c1324720kZq = this.LLJJIJI;
                    if (c1324720kZq == null) {
                        c1324720kZq = null;
                    }
                    W5(urls2, c1324720kZq, c0iya);
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    String nickName = user2.getNickName();
                    String username = user2.getUsername();
                    c1243240iSQ.getClass();
                    String strLIZLLL = C1243240iSQ.LIZLLL(nickName, username);
                    TextView textView = this.LLJJIJIIJIL;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setText(strLIZLLL);
                    C1387040mCM.LIZ(this.itemView, new AwS127S1000000_24(strLIZLLL, 0));
                }
                SlimRoom.LinkMic linkMic2 = slimRoom.getLinkMic();
                if (linkMic2 != null && (list = linkMic2.followedList) != null && (user = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 1)) != null) {
                    ImageModel avatarThumb2 = user.getAvatarThumb();
                    if (avatarThumb2 != null) {
                        urls = avatarThumb2.getUrls();
                    } else {
                        urls = null;
                    }
                    C1324720kZq c1324720kZq2 = this.LLJJIII;
                    if (c1324720kZq2 == null) {
                        c1324720kZq2 = null;
                    }
                    W5(urls, c1324720kZq2, c0iya);
                }
            }
            TextView textView2 = this.LLJJJ;
            if (textView2 == null) {
                textView2 = null;
            }
            if (slimRoom.getLinkMic().followedCount > 1) {
                if (C444960Hcc.LIZIZ()) {
                    TextView textView3 = this.LLJJJ;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(slimRoom.getLinkMic().followedCount - 1);
                    sbLIZ.append('+');
                    textView3.setText(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    TextView textView4 = this.LLJJJ;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('+');
                    sbLIZ2.append(slimRoom.getLinkMic().followedCount - 1);
                    textView4.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                i = 8;
            }
            C786410Ut5.LLIL(textView2, i);
            if (this.LLILLJJLI && C1605490rsh.LIZJ.LIZ == 0 && (c21569819bE = this.LLILLL) != null) {
                c21569819bE.LJFF();
            }
            if (C1607450rvr.LIZ().presetRoomInfo) {
                InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
                C1598190rgv c1598190rgv2 = (C1598190rgv) getItem();
                if (c1598190rgv2 != null && (inboxLiveNotice = c1598190rgv2.LLILLL) != null) {
                    slimRoom2 = inboxLiveNotice.roomInfo;
                }
                interfaceC20673515v3K4.T8(C0IVT.LIZ("message", "live_cover", slimRoom2));
            }
            if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableInboxHead && getAbsoluteAdapterPosition() == 1 && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
                c0j5oZ5.LJ(this.itemView.getContext(), slimRoom, "message");
            }
            T5();
        }
    }
}
