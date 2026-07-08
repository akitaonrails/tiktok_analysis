package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.C01GW;
import X.C1558520qew;
import X.C1559260qg8;
import X.C452501pT;
import X.C457780HxI;
import X.C461500I7w;
import X.C461530I7z;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.InterfaceC1587906Jp;
import X.InterfaceC461490I7v;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class TextBigEmojiAssem extends ReusedUISlotAssem<TextBigEmojiAssem> implements InterfaceC712990Rxx<InterfaceC461490I7v> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm_;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public TextBigEmojiAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 338));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        TuxTextView tuxTextView = (TuxTextView) this.LLJL.getValue();
        tuxTextView.LJJJJI(48.0f);
        tuxTextView.setClickable(true);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public final void up(InterfaceC461490I7v interfaceC461490I7v) {
        ((TextView) this.LLJL.getValue()).setText(interfaceC461490I7v.LJIILL());
        C786410Ut5.I7(null, getContentView());
        MessageListTextBigEmojiClickAbility messageListTextBigEmojiClickAbility = (MessageListTextBigEmojiClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MessageListTextBigEmojiClickAbility.class, null);
        if (messageListTextBigEmojiClickAbility != null) {
            messageListTextBigEmojiClickAbility.qI2(((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL, interfaceC461490I7v.LJIILL().toString(), new AwS215S0300000_6(messageListTextBigEmojiClickAbility, this, interfaceC461490I7v, 2));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461490I7v interfaceC461490I7v) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461490I7v interfaceC461490I7v) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C461500I7w c461500I7w;
        InterfaceC461490I7v interfaceC461490I7v = (InterfaceC461490I7v) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C461500I7w) && (c461500I7w = (C461500I7w) obj2) != null && c461500I7w.LIZ) {
                    up(interfaceC461490I7v);
                }
            }
            return;
        }
        up(interfaceC461490I7v);
    }
}
