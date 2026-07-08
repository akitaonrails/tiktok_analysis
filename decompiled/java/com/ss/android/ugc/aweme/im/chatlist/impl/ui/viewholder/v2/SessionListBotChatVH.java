package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.AnonymousClass0629;
import X.C01GW;
import X.C0HZQ;
import X.C0I31;
import X.C0Z37;
import X.C0Z72;
import X.C0Z74;
import X.C0Z7G;
import X.C0Z86;
import X.C0Z8A;
import X.C0Z8B;
import X.C0Z8E;
import X.C0Z8P;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZQ1;
import X.C1322110kVd;
import X.C1906570ziJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C878950Ydx;
import X.C883680Yla;
import X.C890610Ywl;
import X.InterfaceC1508640pMU;
import X.InterfaceC1891350zJl;
import X.InterfaceC888500YtM;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SessionListBotChatVH extends SessionListIMBaseVH<C0Z8P, C883680Yla> implements C0Z37<C0Z7G>, InterfaceC1508640pMU {
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "SessionListBotChatVH";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B
    public final C0HZQ b() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final String b6() {
        return "bot_chat_vh";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLLILZLLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final C0Z8E b7() {
        return (C0Z8E) this.LLLIZZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach() {
        /*
            r5 = this;
            super.onAttach()
            VO extends X.0YtM r4 = r5.LLJJIJIIJIL
            X.0Z8P r4 = (X.C0Z8P) r4
            if (r4 != 0) goto La
            return
        La:
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r1 = X.C0YSQ.LIZIZ(r0)
            java.lang.String r0 = r4.getSessionId()
            X.0Y8T r1 = r1.LIZ(r0)
            X.0629 r0 = com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI r0 = X.AnonymousClass0629.LIZ()
            X.06k7 r3 = r0.LIZ()
            X.10Ec r0 = X.C19212010Ec.LIZJ
            X.05RV r0 = r0.LIZJ()
            java.lang.String r2 = r0.getMobValue()
            if (r1 == 0) goto L40
            boolean r0 = r1.isStickTop()
            r1 = 1
            if (r0 != r1) goto L40
        L38:
            java.lang.String r0 = r4.getSessionId()
            r3.LJJJ(r2, r0, r1)
            return
        L40:
            r1 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBotChatVH.onAttach():void");
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public final void onDetach() {
        super.onDetach();
        IDMAvatarLoader iDMAvatarLoaderC6 = C6();
        if (iDMAvatarLoaderC6 != null) {
            iDMAvatarLoaderC6.LIZ();
        }
    }

    public SessionListBotChatVH(View view) {
        super(view);
        C786410Ut5.Sd(R.layout.cmu, C786410Ut5.ne(view.getContext()), (ViewGroup) this.itemView.findViewById(R.id.uud));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 425));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 426));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 427));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final void L5(InterfaceC888500YtM interfaceC888500YtM) {
        boolean z;
        C0Z8P c0z8p = (C0Z8P) interfaceC888500YtM;
        Object avatar = c0z8p.getAvatar();
        if (avatar == null) {
            z = true;
        } else {
            z = avatar instanceof UrlModel;
        }
        if (z) {
            IAccessibilityUtils.LIZ.getClass();
            IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
            if (iAccessibilityUtilsLIZ != null) {
                iAccessibilityUtilsLIZ.LIZ((C1322110kVd) this.LLIZ.getValue(), c0z8p.getImUser());
            }
            IDMAvatarLoader iDMAvatarLoaderC6 = C6();
            if (iDMAvatarLoaderC6 != null) {
                iDMAvatarLoaderC6.LIZIZ(null, (UrlModel) avatar, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) this.LLJJJJJIL.getValue(), 95));
            }
        } else {
            super.L5(c0z8p);
        }
        IMAIServiceAPI.LIZ.getClass();
        Drawable drawable = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.INBOX_BOT_AVATAR_LABEL, null).LIZIZ;
        if (drawable != null) {
            ((TuxIconView) this.LLLILZJ.getValue()).setImageDrawable(drawable);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void i6(C0Z72 c0z72) {
        CharSequence content;
        C0Z8A c0z8a;
        super.i6(c0z72);
        TuxTextView tuxTextViewX5 = X5();
        if (tuxTextViewX5 != null) {
            if (c0z72 != null && (c0z8a = c0z72.contentType) != null) {
                content = c0z8a.getContent();
            } else {
                content = null;
            }
            tuxTextViewX5.setText(content);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean k7(C0Z86 c0z86) {
        FilterTabType filterTabType;
        C0Z8P c0z8p = (C0Z8P) c0z86;
        if (!c0z8p.isMute() && c0z8p.getSessionUnreadViewState() != null && !c0z8p.isBlock()) {
            C878950Ydx pageKey = c0z8p.getPageKey();
            if (pageKey != null) {
                filterTabType = pageKey.LLILLL;
            } else {
                filterTabType = null;
            }
            if (filterTabType != FilterTabType.SPAM) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void u6(C0Z86 c0z86) {
        C0Z8B c0z8b;
        C0Z74 rightViewVO = ((C0Z8P) c0z86).getRightViewVO();
        VORightOperationType vORightOperationType = null;
        if (rightViewVO != null) {
            vORightOperationType = rightViewVO.rightOperationType;
        }
        if ((vORightOperationType instanceof C0Z8B) && (c0z8b = (C0Z8B) vORightOperationType) != null) {
            v6(c0z8b.getState());
        }
    }

    public SessionListBotChatVH(ViewGroup viewGroup) {
        this(C1906570ziJ.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.cmz, viewGroup, false, 24));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C890610Ywl) interfaceC1891350zJl, i);
    }
}
