package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content;

import X.C019F;
import X.C09JN;
import X.C0JTU;
import X.C0JUA;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C493130JVn;
import X.C493140JVo;
import X.C493150JVp;
import X.C493170JVr;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteAddCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteContentDescriptionCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteListEmoteCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveSuggestEmoteEntrance;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubWaveEmotePageContentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubWaveEmotePageContentAssem.class, "subWaveEmotePageViewModel", "getSubWaveEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subwave/emote/SubWaveEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubWaveEmotePageContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubWaveEmotePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C493150JVp(c19719912DlLIZ), new C493170JVr(), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C0JTU.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.h10);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SubWaveEmoteContentDescriptionCell.class, SubWaveEmoteListEmoteCell.class, SubWaveEmoteAddCell.class, SubWaveSuggestEmoteEntrance.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new StaggeredGridLayoutManager(4, 1));
        this.LLJI = viewOnAttachStateChangeListenerC20604515jv;
        String str = ((C0JTU) this.LLJ.getValue()).LLILLJJLI;
        if (str != null) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            final SubWaveEmotePageViewModel subWaveEmotePageViewModel = (SubWaveEmotePageViewModel) assemVMLazy.getValue();
            ((C0JUA) subWaveEmotePageViewModel.LL.getValue().getOperator()).LJII(str).LJJLL(new C09JN() { // from class: X.0JUU
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
                
                    if (r10.violationId != 0) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
                
                    r19 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
                
                    if (r10.violationId == 0) goto L55;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
                
                    if (r10.violationId != 0) goto L20;
                 */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r26) {
                    /*
                        Method dump skipped, instruction units count: 344
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0JUU.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.00MD
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.fetchEmotes$disposable$2");
                    C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.fetchEmotes$disposable$2");
                }
            });
        }
        AssemVMLazy assemVMLazy2 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.0JVm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JUV) obj).LLILLJJLI;
            }
        }, null, new C493140JVo(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0JVl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JUV) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new C493130JVn(this), 4);
    }
}
