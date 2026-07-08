package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content;

import X.C019F;
import X.C09JN;
import X.C0JQ3;
import X.C0JVN;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C493060JVg;
import X.C493070JVh;
import X.C493080JVi;
import X.C493160JVq;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteAddCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteContentDescriptionCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteHintCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteListEmoteCell;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SuggestEmotePageContentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SuggestEmotePageContentAssem.class, "suggestEmotePageViewModel", "getSuggestEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/suggestemote/SuggestEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SuggestEmotePageContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SuggestEmotePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C493080JVi(c19719912DlLIZ), new C493160JVq(), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C0JQ3.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.h10);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SuggestEmoteHintCell.class, SuggestEmoteContentDescriptionCell.class, SuggestEmoteListEmoteCell.class, SuggestEmoteAddCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new StaggeredGridLayoutManager(4, 1));
        this.LLJI = viewOnAttachStateChangeListenerC20604515jv;
        String str = ((C0JQ3) this.LLJ.getValue()).LL;
        if (str != null) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            final SuggestEmotePageViewModel suggestEmotePageViewModel = (SuggestEmotePageViewModel) assemVMLazy.getValue();
            ((C0JVN) suggestEmotePageViewModel.LL.getValue().getOperator()).LJII(str).LJJLL(new C09JN() { // from class: X.0JUt
                /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
                
                    if (r5.violationId != 0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
                
                    r24 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
                
                    r17 = r17 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
                
                    if (r5.violationId == 0) goto L57;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
                
                    if (r5.violationId != 0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
                
                    if (r5.violationId == 0) goto L57;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
                
                    r24 = 2;
                 */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r29) {
                    /*
                        Method dump skipped, instruction units count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C492930JUt.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.00MR
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("SuggestEmotePageViewModel@d5d7.fetchEmotes$disposable$2");
                    C1C7U.LIZIZ("SuggestEmotePageViewModel@d5d7.fetchEmotes$disposable$2");
                }
            });
        }
        AssemVMLazy assemVMLazy2 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.0JVk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C492830JUj) obj).LL;
            }
        }, null, new C493070JVh(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0JVj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C492830JUj) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new C493060JVg(this), 4);
    }
}
