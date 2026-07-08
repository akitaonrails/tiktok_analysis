package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC482420Ivw;
import X.C03H8;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1819620xS4;
import X.C21146717pB;
import X.C426750GoL;
import X.C481820Iuy;
import X.C482300Ivk;
import X.C482380Ivs;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.zhiliaoapp.musically.R;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutSectionMultiGuestRoomCell extends ToplivePagePowerCell<C482380Ivs> implements C03H8 {
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public C1324720kZq LLILZIL;
    public C1324720kZq LLILZLL;
    public C1324720kZq LLIZ;

    public HangoutSectionMultiGuestRoomCell() {
        super(false);
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    public final void L5() {
        String str;
        String str2;
        ToplivePageItem toplivePageItem;
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        C482300Ivk.LIZ.getClass();
        ToplivePageItem toplivePageItem2 = C482300Ivk.LIZJ;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        ToplivePageItem toplivePageItem3 = abstractC482420Ivw != null ? abstractC482420Ivw.LL : null;
        AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw2 == null || (str = abstractC482420Ivw2.LLILLL) == null) {
            str = "";
        }
        AbstractC482420Ivw abstractC482420Ivw3 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw3 == null || (str2 = abstractC482420Ivw3.LLILLJJLI) == null) {
            str2 = "hangout";
        }
        c481820Iuy.getClass();
        C481820Iuy.LIZLLL(toplivePageItem2, toplivePageItem3, str, str2);
        AbstractC482420Ivw abstractC482420Ivw4 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw4 == null || (toplivePageItem = abstractC482420Ivw4.LL) == null) {
            return;
        }
        Room room = toplivePageItem.room;
        String str3 = toplivePageItem.enterMethod;
        AbstractC482420Ivw abstractC482420Ivw5 = (AbstractC482420Ivw) getItem();
        C481820Iuy.LJ(room, str3, abstractC482420Ivw5 != null ? abstractC482420Ivw5.LLILLL : null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null) {
            this.LLILLJJLI = (TextView) view.findViewById(R.id.jg3);
            this.LLILLL = (TextView) view.findViewById(R.id.jg2);
            this.LLILZ = (TextView) view.findViewById(R.id.jg4);
            this.LLILZIL = (C1324720kZq) view.findViewById(R.id.ld8);
            this.LLILZLL = (C1324720kZq) view.findViewById(R.id.ld9);
            this.LLIZ = (C1324720kZq) view.findViewById(R.id.ld_);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:26:0x0061, B:28:0x0065, B:29:0x0070, B:30:0x0073, B:32:0x0079, B:33:0x007d, B:34:0x008e, B:36:0x0094, B:38:0x009c, B:39:0x00b5, B:41:0x00bd, B:43:0x00c3, B:44:0x00c7, B:46:0x00db, B:48:0x00e3, B:49:0x00eb, B:51:0x00f3), top: B:81:0x0061 }] */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C482380Ivs r11) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.toplive.cell.HangoutSectionMultiGuestRoomCell.onBindItemView(X.0Ivs):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (ToplivePageLoadAdvanceSetting.LIZ().enableLayoutPreload) {
            return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.f893did, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f893did, viewGroup, false);
    }

    public final void R5(View view, float f) {
        if (view == null) {
            return;
        }
        if (C426750GoL.LIZLLL(view.getContext())) {
            C786410Ut5.Jc(view, -f);
        } else {
            C786410Ut5.Jc(view, f);
        }
    }

    public static void N5(ImageModel imageModel, C1324720kZq c1324720kZq, int i, int i2) {
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJI = i;
        c1324610kZfLJIIIZ.LJII = i2;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
    }
}
