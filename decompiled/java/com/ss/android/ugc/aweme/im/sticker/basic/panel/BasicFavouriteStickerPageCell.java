package com.ss.android.ugc.aweme.im.sticker.basic.panel;

import X.AbstractC450030Hkn;
import X.AnonymousClass0956;
import X.C05YD;
import X.C08SN;
import X.C08SO;
import X.C0H3N;
import X.C0I0B;
import X.C13BV;
import X.C13LE;
import X.C1807670x8n;
import X.C1876407Wo;
import X.C2217381BqS;
import X.C23250099c;
import X.C443730Had;
import X.C449700HkG;
import X.C449750HkL;
import X.C450050Hkp;
import X.C450470HlV;
import X.C450880HmA;
import X.EnumC451500HnA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC450290HlD;
import X.InterfaceC450890HmB;
import X.InterfaceC453640Hqc;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.ui.BaseStickerPanelCell;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class BasicFavouriteStickerPageCell extends BaseStickerPanelCell<C1876407Wo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C450470HlV LLJI;
    public AnonymousClass0956 LLJIJIL;
    public final int LLJILJIL = 7;
    public volatile InterfaceC450290HlD LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasicFavouriteStickerPageCell.class, "stickersRepository", "getStickersRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
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
        return new C449750HkL(Integer.valueOf(this.LLJILJIL), 2);
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final int I5() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1876407Wo c1876407Wo = (C1876407Wo) interfaceC1891350zJl;
        super.onBindItemView(c1876407Wo);
        C450470HlV c450470HlV = this.LLJI;
        if (c450470HlV != null) {
            c450470HlV.LJIIZILJ(c1876407Wo.LL);
            AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C449700HkG(this, c450470HlV, null), 3);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C450470HlV c450470HlV = new C450470HlV(this, viewGroup, new C0H3N() { // from class: X.0HkM
            @Override // X.C0H3N
            public final void LIZ(boolean z) {
                this.LIZ.R5().JQ2(z);
            }
        }, C443730Had.LIZIZ, new C450880HmA(), R5().wQ2().LLILLJJLI, new InterfaceC450890HmB() { // from class: X.0HkN
            @Override // X.InterfaceC450890HmB
            @InterfaceC1294060jmO
            public final void LIZ(View view, C451030HmP c451030HmP) {
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
            @InterfaceC1294060jmO
            public final void LJFF(InterfaceC449850HkV interfaceC449850HkV, Rect rect) {
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
            public final void LIZIZ(StickerItem stickerItem, Rect rect) {
                this.LIZ.P5().vQ2(new C454060HrI(stickerItem, EnumC454490Hrz.DM_STICKER_PANEL, null, rect, null, null, null, null, 244));
            }
        }, LifecycleOwnerKt.getLifecycleScope(this), R5().wQ2().LLJJJJ, R5().wQ2().LLJJLIIIJLLLLLLLZ);
        this.LLJI = c450470HlV;
        return c450470HlV.LJIIL(true);
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final void U5(EnumC451500HnA enumC451500HnA, String str) {
        final List<StickerItem> listLIZ;
        int size;
        InterfaceC450290HlD interfaceC450290HlD = this.LLJILJILJ;
        if (interfaceC450290HlD == null) {
            synchronized (this) {
                interfaceC450290HlD = this.LLJILJILJ;
                if (interfaceC450290HlD == null) {
                    interfaceC450290HlD = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                    this.LLJILJILJ = interfaceC450290HlD;
                }
            }
        }
        C05YD<AbstractC450030Hkn<List<StickerItem>>> favouriteStickersFlow = interfaceC450290HlD.getFavouriteStickersFlow();
        AbstractC450030Hkn<List<StickerItem>> value = null;
        if (favouriteStickersFlow == null || (value = favouriteStickersFlow.getValue()) == null || (listLIZ = value.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        InterfaceC453640Hqc imStickerAnalytics = IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics();
        if (value instanceof C450050Hkp) {
            size = -1;
        } else {
            size = listLIZ.size();
        }
        Integer numValueOf = Integer.valueOf(size);
        Map mapLIZ = C08SO.LIZ(new C08SN<StickerItem, String>() { // from class: X.0HkK
            @Override // X.C08SN
            public final Iterator<StickerItem> LIZ() {
                return listLIZ.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(StickerItem stickerItem) {
                Integer num;
                InterfaceC453640Hqc imStickerAnalytics2 = IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics();
                StickerBase stickerBase = stickerItem.stickerBase;
                if (stickerBase != null) {
                    num = stickerBase.stickerType;
                } else {
                    num = null;
                }
                return imStickerAnalytics2.LIZ(num);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLIZ.entrySet()) {
            if (((String) entry.getKey()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        imStickerAnalytics.LJJIFFI("chat", str, enumC451500HnA, numValueOf, linkedHashMap, null, C0I0B.LJFF.LIZIZ());
    }
}
