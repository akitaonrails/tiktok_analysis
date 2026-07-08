package com.ss.android.ugc.aweme.social.thought.inbox;

import X.C05S0;
import X.C13LN;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1618440sDa;
import X.C1826450xd5;
import X.C1848410yCV;
import X.C1BNE;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2252321DDq;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C438710HIf;
import X.C443000HYs;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1256540ins;
import X.EnumC1606080rte;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import avg.f;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.inbox.ThoughtInboxItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS598S0100000_19;
import mf.a;

/* JADX INFO: loaded from: classes20.dex */
public final class ThoughtInboxCell extends PowerCell<ThoughtInboxItem> implements View.OnClickListener {
    public AvatarComponentView LL;
    public TuxTextView LLILLJJLI;
    public C1826450xd5 LLILLL;
    public final C2252321DDq LLILZ = C1BNE.LIZ(null);

    public final ISocialThoughtDataCenterService I5() {
        SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
        if (socialThoughtService != null) {
            return socialThoughtService.LJJIIZI();
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        int iLIZIZ;
        super.onItemViewCreated();
        this.LL = (AvatarComponentView) this.itemView.findViewById(R.id.xu5);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.xu7);
        this.LLILLL = (C1826450xd5) this.itemView.findViewById(R.id.xu6);
        if (C443000HYs.LIZ()) {
            C1826450xd5 c1826450xd5 = this.LLILLL;
            if (c1826450xd5 != null) {
                c1826450xd5.setContentMaxLines(2);
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74));
        } else {
            C1826450xd5 c1826450xd52 = this.LLILLL;
            if (c1826450xd52 != null) {
                c1826450xd52.setContentMaxLines(3);
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        }
        C1826450xd5 c1826450xd53 = this.LLILLL;
        if (c1826450xd53 != null) {
            c1826450xd53.LJIL(EnumC1256540ins.INBOX);
        }
        C1826450xd5 c1826450xd54 = this.LLILLL;
        if (c1826450xd54 != null) {
            c1826450xd54.setContentMaxWidth(iLIZIZ);
        }
        C786410Ut5.I7(this, this.itemView);
        AvatarComponentView avatarComponentView = this.LL;
        if (avatarComponentView != null) {
            C786410Ut5.y9(avatarComponentView, this);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, this);
        }
        C1826450xd5 c1826450xd55 = this.LLILLL;
        if (c1826450xd55 != null) {
            a aVar = new a(C1848410yCV.LIZ ? new f(this) : this);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1826450xd55);
            }
            c1826450xd55.setOnClickListener(aVar);
        }
        C05S0 c05s0 = C05S0.LIZ;
        C2252321DDq c2252321DDq = this.LLILZ;
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 259);
        c05s0.getClass();
        C05S0.LIZ(this, c2252321DDq, false, awS598S0100000_19);
        C2211631BhB.LJ(this.itemView, new AwS598S0100000_19(this, 650));
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.INBOX_TOP_LIST;
        View view = this.itemView;
        AvatarComponentView avatarComponentView2 = this.LL;
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(view, avatarComponentView2, avatarComponentView2 != null ? avatarComponentView2.getAvatar() : null, this.LLILLJJLI, (TuxIconView) null, 48), false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        this.LLILZ.setValue(null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLL;
        ThoughtInfo thoughtInfoCopy;
        AvatarComponentView avatarComponentView;
        C427660Gpo avatar;
        ThoughtInboxItem thoughtInboxItem = (ThoughtInboxItem) interfaceC1891350zJl;
        super.onBindItemView(thoughtInboxItem);
        User thoughtUser = thoughtInboxItem.getThoughtUser();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtInboxCell.onBindItemView: uid=");
        sbLIZ.append(thoughtUser.getUid());
        sbLIZ.append(" nickname=");
        sbLIZ.append(thoughtUser.getNickname());
        sbLIZ.append(" thoughtId=");
        sbLIZ.append(thoughtInboxItem.getThoughtInfo().thoughtId);
        sbLIZ.append(" text=");
        String str = thoughtInboxItem.getThoughtInfo().textContent;
        if (str != null) {
            strLL = C13LN.LL(40, str);
        } else {
            strLL = null;
        }
        sbLIZ.append(strLL);
        C2188811AlT.LIZIZ(sbLIZ);
        UrlModel avatarThumb = thoughtUser.getAvatarThumb();
        if (avatarThumb != null && (avatarComponentView = this.LL) != null && (avatar = avatarComponentView.getAvatar()) != null) {
            C427660Gpo.LJIIJJI(avatar, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(thoughtUser.getNickname());
        }
        String uid = thoughtUser.getUid();
        if (uid != null && uid.length() != 0) {
            String str2 = thoughtInboxItem.getThoughtInfo().authorUid;
            if (str2 != null && str2.length() != 0) {
                thoughtInfoCopy = thoughtInboxItem.getThoughtInfo();
            } else {
                ThoughtInfo thoughtInfo = thoughtInboxItem.getThoughtInfo();
                thoughtInfoCopy = thoughtInfo.copy(thoughtInfo.thoughtId, thoughtInfo.textContent, thoughtInfo.createTimeMs, thoughtInfo.privacySetting, thoughtInfo.interactionPreview, thoughtInfo.viewerInteraction, uid, thoughtInfo.isPublishing);
            }
            ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceI5 = I5();
            if (iSocialThoughtDataCenterServiceI5 != null) {
                iSocialThoughtDataCenterServiceI5.LJII(uid, thoughtInfoCopy);
            }
        }
        this.LLILZ.setValue(uid);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.thought.inbox.ThoughtInboxCell.onClick(android.view.View):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1618440sDa.LIZIZ.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.ft6, viewGroup, false);
    }
}
