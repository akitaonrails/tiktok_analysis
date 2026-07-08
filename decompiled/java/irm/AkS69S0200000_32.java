package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C115Y;
import X.C1624230sMv;
import X.C18V2;
import X.C21355718hn;
import X.C21356918hz;
import X.C21357918i9;
import X.C522610KeZ;
import X.C528500Ko4;
import X.C869590Y9l;
import X.C909930Zmp;
import X.C910260ZnM;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem;
import com.ss.android.ugc.tools.chat.message.cell.reusableslot.SendMessageStatusSlotAssem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public class AkS69S0200000_32 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS69S0200000_32 akS69S0200000_32, View view) {
        C869590Y9l c869590Y9l;
        SendMessageStatusSlotAssem sendMessageStatusSlotAssem = (SendMessageStatusSlotAssem) akS69S0200000_32.l0;
        C909930Zmp c909930Zmp = ((C18V2) akS69S0200000_32.l1).LLILLL;
        if (c909930Zmp != null) {
            c869590Y9l = c909930Zmp.LIZ;
        } else {
            c869590Y9l = null;
        }
        sendMessageStatusSlotAssem.zp(c869590Y9l);
    }

    public static final void LIZ$1(AkS69S0200000_32 akS69S0200000_32, View view) {
        C869590Y9l c869590Y9l;
        SendMessageStatusSlotAssem sendMessageStatusSlotAssem = (SendMessageStatusSlotAssem) akS69S0200000_32.l0;
        C909930Zmp c909930Zmp = ((C18V2) akS69S0200000_32.l1).LLILLL;
        if (c909930Zmp != null) {
            c869590Y9l = c909930Zmp.LIZ;
        } else {
            c869590Y9l = null;
        }
        sendMessageStatusSlotAssem.zp(c869590Y9l);
    }

    public static final void LIZ$2(AkS69S0200000_32 akS69S0200000_32, View view) {
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            ((SkeletonLayoutContainerAssem) akS69S0200000_32.l0).sp().getContext();
            ((C910260ZnM) akS69S0200000_32.l1).LIZLLL();
            iDmToolsDebugService.LIZIZ();
        }
    }

    public static final void LIZ$3(AkS69S0200000_32 akS69S0200000_32, View view) {
        ((C21355718hn) akS69S0200000_32.l0).getClass();
        C21355718hn c21355718hn = (C21355718hn) akS69S0200000_32.l0;
        C1624230sMv c1624230sMv = c21355718hn.LLILZLL;
        boolean z = true;
        if (c1624230sMv != null && c1624230sMv.LIZIZ) {
            C115Y c115y = (C115Y) akS69S0200000_32.l1;
            int adapterPosition = c115y.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < ((ArrayList) c21355718hn.LLIZLLLIL).size()) {
                C21356918hz c21356918hz = (C21356918hz) ListProtector.get(c21355718hn.LLIZLLLIL, adapterPosition);
                int i = c21356918hz.LJI;
                if (i == 3) {
                    c21355718hn.LLLI();
                    c21355718hn.LLLJ(c115y);
                    c21355718hn.notifyDataSetChanged();
                } else {
                    if (i == 1) {
                        c21355718hn.LLIZ = null;
                        int i2 = c21355718hn.LLILZIL;
                        if (i2 >= 0) {
                            c21355718hn.notifyItemChanged(i2);
                        }
                        c21355718hn.LLILZIL = -1;
                    }
                    if (c21355718hn.LLJ.containsKey(c21356918hz)) {
                        c21356918hz.LJIIIZ = -1;
                        Integer numRemove = c21355718hn.LLJ.remove(c21356918hz);
                        if (numRemove != null) {
                            int iIntValue = numRemove.intValue();
                            for (C21356918hz c21356918hz2 : (ArrayList) c21355718hn.LLIZLLLIL) {
                                int i3 = c21356918hz2.LJIIIZ;
                                if (i3 != -1 && i3 > iIntValue) {
                                    int i4 = i3 - 1;
                                    c21356918hz2.LJIIIZ = i4;
                                    c21355718hn.LLJ.put(c21356918hz2, Integer.valueOf(i4));
                                }
                            }
                        }
                    } else {
                        C1624230sMv c1624230sMv2 = c21355718hn.LLILZLL;
                        if (c1624230sMv2 == null || c21355718hn.LLJ.size() != c1624230sMv2.LIZLLL) {
                            int size = c21355718hn.LLJ.size() + 1;
                            c21355718hn.LLJ.put(c21356918hz, Integer.valueOf(size));
                            c21356918hz.LJIIIZ = size;
                            if (C522610KeZ.LIZ()) {
                                c21356918hz.LJIIJ = adapterPosition;
                                C528500Ko4.LIZIZ = adapterPosition;
                            }
                        }
                        c21355718hn.LLILZ.invoke(Boolean.valueOf(z), c21356918hz, c21355718hn.LLLIIIIL(), c21355718hn.LLJ);
                        c21355718hn.notifyDataSetChanged();
                    }
                    z = false;
                    c21355718hn.LLILZ.invoke(Boolean.valueOf(z), c21356918hz, c21355718hn.LLLIIIIL(), c21355718hn.LLJ);
                    c21355718hn.notifyDataSetChanged();
                }
            }
        } else {
            c21355718hn.LLLJ((C115Y) akS69S0200000_32.l1);
        }
        C21357918i9.LIZLLL = "video_shoot_page_picker";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS69S0200000_32(C21355718hn c21355718hn, C115Y c115y, int i) {
        super(800L);
        this.$t = i;
        this.l0 = c21355718hn;
        this.l1 = c115y;
    }

    public AkS69S0200000_32(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
