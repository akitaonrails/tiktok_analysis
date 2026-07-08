package com.ss.android.ugc.aweme.im.sticker.basic.panel;

import X.AnonymousClass0956;
import X.C0H3N;
import X.C13LE;
import X.C2217381BqS;
import X.C23250099c;
import X.C443900Hau;
import X.C444150HbJ;
import X.C449630Hk9;
import X.C449750HkL;
import X.C450470HlV;
import X.C450880HmA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC444050Hb9;
import X.InterfaceC450290HlD;
import X.InterfaceC450890HmB;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.ui.BaseStickerPanelCell;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BasicSetStickerPageCell extends BaseStickerPanelCell<C444150HbJ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C450470HlV LLJI;
    public AnonymousClass0956 LLJIJIL;
    public final int LLJILJIL = 9;
    public volatile InterfaceC450290HlD LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasicSetStickerPageCell.class, "stickersRepository", "getStickersRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final void LJJJJLI() {
        C450470HlV c450470HlV = this.LLJI;
        if (c450470HlV != null) {
            c450470HlV.LJ().scrollToPosition(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final C449750HkL T5() {
        return new C449750HkL(Integer.valueOf(this.LLJILJIL), IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LIZIZ(R5().CQ2(getAbsoluteAdapterPosition())));
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final int I5() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C443900Hau c443900Hau;
        StickerSetInfo stickerSetInfo;
        Long l;
        C444150HbJ c444150HbJ = (C444150HbJ) interfaceC1891350zJl;
        super.onBindItemView(c444150HbJ);
        C450470HlV c450470HlV = this.LLJI;
        if (c450470HlV != null) {
            c450470HlV.LJIIZILJ(c444150HbJ.LL);
            InterfaceC444050Hb9 interfaceC444050Hb9 = c444150HbJ.LL;
            if ((interfaceC444050Hb9 instanceof C443900Hau) && (c443900Hau = (C443900Hau) interfaceC444050Hb9) != null && (stickerSetInfo = c443900Hau.LIZIZ) != null && (l = stickerSetInfo.setId) != null) {
                long jLongValue = l.longValue();
                AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C449630Hk9(this, jLongValue, c450470HlV, c444150HbJ, null), 3);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C450470HlV c450470HlV = new C450470HlV(this, viewGroup, new C0H3N() { // from class: X.0HkR
            @Override // X.C0H3N
            public final void LIZ(boolean z) {
                this.LIZ.R5().JQ2(z);
            }
        }, new C443900Hau(), new C450880HmA(), R5().wQ2().LLILLJJLI, new InterfaceC450890HmB() { // from class: X.0HkO
            @Override // X.InterfaceC450890HmB
            @InterfaceC1294060jmO
            public final void LIZ(View view, C451030HmP c451030HmP) {
            }

            @Override // X.InterfaceC450890HmB
            public final void LIZIZ(StickerItem stickerItem, Rect rect) {
            }

            @Override // X.InterfaceC450890HmB
            public final void LIZJ() {
            }

            @Override // X.InterfaceC450890HmB
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC450890HmB
            public final void LJ() {
            }

            @Override // X.InterfaceC450890HmB
            public final void LJI(String str) {
            }

            @Override // X.InterfaceC450890HmB
            public final void Op() {
            }

            @Override // X.InterfaceC450890HmB
            public final void ji(String str, boolean z, boolean z2) {
            }

            @Override // X.InterfaceC450890HmB
            public final void zm(CommentPersonalizedEmoji commentPersonalizedEmoji) {
            }

            @Override // X.InterfaceC450890HmB
            public final void LJFF(InterfaceC449850HkV interfaceC449850HkV, Rect rect) {
                if ((interfaceC449850HkV instanceof SetSticker) && interfaceC449850HkV != null) {
                    IMStickerPanelEventViewModel iMStickerPanelEventViewModelP5 = this.LIZ.P5();
                    C454010HrD c454010HrD = new C454010HrD(interfaceC449850HkV, EnumC454490Hrz.DM_STICKER_PANEL, rect, null, 24);
                    iMStickerPanelEventViewModelP5.getClass();
                    iMStickerPanelEventViewModelP5.setState(new AwS585S0100000_6(c454010HrD, 368));
                }
            }
        }, LifecycleOwnerKt.getLifecycleScope(this), R5().wQ2().LLJJJJ, R5().wQ2().LLJJLIIIJLLLLLLLZ);
        this.LLJI = c450470HlV;
        return c450470HlV.LJIIL(true);
    }
}
