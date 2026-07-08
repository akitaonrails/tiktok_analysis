package com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol;

import X.AbstractC1387200mCc;
import X.AnonymousClass0956;
import X.C054G;
import X.C09AE;
import X.C0Y8T;
import X.C0YNP;
import X.C0ZSC;
import X.C0ZSD;
import X.C0ZXO;
import X.C0ZXP;
import X.C0ZXS;
import X.C1308910kAL;
import X.C1499105tt;
import X.C1499405tw;
import X.C1499505tx;
import X.C1502805uU;
import X.C1508705vR;
import X.C15392060w;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1860130yVP;
import X.C1860140yVQ;
import X.C1906580ziK;
import X.C21379318lb;
import X.C21419418s4;
import X.C23250099c;
import X.C330610Cxf;
import X.C418440Gaw;
import X.C444890HcV;
import X.C457780HxI;
import X.C461530I7z;
import X.C723580SZw;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.InterfaceC1587906Jp;
import X.InterfaceC328690CuZ;
import X.InterfaceC712990Rxx;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.MarkdownMessageTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.search.ISearchMarkdownService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MarkdownMsgAssem<T extends C0ZSC> extends ReusedUISlotAssem<MarkdownMsgAssem<?>> implements InterfaceC712990Rxx<T> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public C1860130yVP LLJLIL;
    public C09AE LLJLILLLLZIIL;
    public AnonymousClass0956 LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.coz;
    }

    public abstract boolean up();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        IMSelectTextAbility iMSelectTextAbilityTp;
        C09AE c09ae = this.LLJLILLLLZIIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LLJLIL == null || (iMSelectTextAbilityTp = tp()) == null) {
            return;
        }
        iMSelectTextAbilityTp.gv1();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C09AE c09ae = this.LLJLILLLLZIIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    public final IMSelectTextAbility tp() {
        return (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMSelectTextAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Activity activityLIZIZ;
        ISearchMarkdownService iSearchMarkdownService;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (iSearchMarkdownService = (ISearchMarkdownService) PluggableExtentionKt.pluggableSpi$default(ISearchMarkdownService.class, false, false, false, 14, null)) != null) {
            iSearchMarkdownService.LIZLLL(activityLIZIZ);
        }
        C0ZXP c0zxp = C0ZXP.LIZ;
        C1860130yVP c1860130yVPLIZ = C0ZXP.LIZ(view.getContext());
        this.LLJLIL = c1860130yVPLIZ;
        ((ViewGroup) view.findViewById(R.id.k_n)).addView(c1860130yVPLIZ, new FrameLayout.LayoutParams(-2, -2, 17));
        C1860130yVP c1860130yVP = this.LLJLIL;
        if (c1860130yVP != null) {
            int i = (int) (((double) view.getContext().getResources().getDisplayMetrics().widthPixels) * 0.7d);
            if (up()) {
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(41);
                c1860130yVP.getPaint().setTextSize(c444890HcV.getTextSize());
                c1860130yVP.getPaint().setTypeface(c444890HcV.getTypeface());
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, c1860130yVP.getContext());
                if (numLIZJ != null) {
                    c1860130yVP.setTextColor(numLIZJ.intValue());
                }
            } else {
                C444890HcV c444890HcV2 = new C444890HcV();
                c444890HcV2.LIZ(41);
                c1860130yVP.getPaint().setTextSize(c444890HcV2.getTextSize());
                c1860130yVP.getPaint().setTypeface(c444890HcV2.getTypeface());
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, c1860130yVP.getContext());
                if (numLIZJ2 != null) {
                    c1860130yVP.setTextColor(numLIZJ2.intValue());
                }
            }
            c1860130yVP.setMaxWidth(i);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0ZXO(this, null), 3);
    }

    public void op(C0ZXS c0zxs) {
        int iLIZIZ;
        View viewFindViewById = getContentView().findViewById(R.id.k_n);
        viewFindViewById.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZLLL))));
        int i = c0zxs.LIZIZ.LIZ;
        int iLIZIZ2 = 0;
        if (i > 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        } else {
            iLIZIZ = 0;
        }
        viewFindViewById.setMinimumWidth(iLIZIZ);
        int i2 = c0zxs.LIZIZ.LIZIZ;
        if (i2 > 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        }
        viewFindViewById.setMinimumHeight(iLIZIZ2);
    }

    public final long sp(T t) {
        String str;
        C1860130yVP c1860130yVP;
        SessionInfo sessionInfo;
        String conversationId;
        String strLIZIZ;
        String str2;
        C1860140yVQ c1860140yVQLIZIZ;
        MarkdownMessageTemplate content = t.getContent();
        if (content == null || (str = content.raw) == null || (c1860130yVP = this.LLJLIL) == null) {
            return 0L;
        }
        C869590Y9l c869590Y9l = t.LLILII().LIZ.LIZ;
        String conversationId2 = c869590Y9l.getConversationId();
        C0Y8T c0y8tLJ = C0YNP.LIZIZ(conversationId2).LJ();
        C0ZXP c0zxp = C0ZXP.LIZ;
        C457780HxI c457780HxI = (C457780HxI) this.LLJL.getValue();
        if (c457780HxI != null) {
            sessionInfo = c457780HxI.LL;
        } else {
            sessionInfo = null;
        }
        c0zxp.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("message_id", Long.valueOf(c869590Y9l.getMsgId()));
        if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
            conversationId = "";
        }
        linkedHashMap.put("conversation_id", conversationId);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("enter_from", "chat");
        if (c0y8tLJ != null) {
            C1508705vR.LL.getClass();
            strLIZIZ = C1508705vR.LIZIZ(c0y8tLJ);
        } else {
            strLIZIZ = null;
        }
        linkedHashMap2.put("chat_type", String.valueOf(strLIZIZ));
        if (up()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap2.put("is_self", str2);
        C15392060w.LIZ.getClass();
        linkedHashMap2.put("reply_message_id", String.valueOf(C15392060w.LIZIZ(c869590Y9l)));
        linkedHashMap2.put("to_user_id", String.valueOf(C0YNP.LJII(conversationId2)));
        linkedHashMap2.put("is_sender", String.valueOf(up()));
        boolean zUp = up();
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC328690CuZ.LIZ.getClass();
        InterfaceC328690CuZ interfaceC328690CuZLIZ = C330610Cxf.LIZ();
        if (interfaceC328690CuZLIZ != null) {
            C21419418s4 c21419418s4 = C21379318lb.LIZ;
            c1860140yVQLIZIZ = interfaceC328690CuZLIZ.LIZIZ(c1860130yVP, str, C21379318lb.LJIIIZ(c1860130yVP.getContext(), zUp), linkedHashMap2);
        } else {
            c1860140yVQLIZIZ = null;
        }
        c1860130yVP.LJJJJJ(c1860140yVQLIZIZ, null);
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: yp, reason: merged with bridge method [inline-methods] */
    public final void up(T t) {
        String str;
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        op(t.LJII());
        long jSp = sp(t);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C054G c054g = C1499405tw.LIZ;
        String strLIZIZ = null;
        C23250099c.LIZLLL(C1499405tw.LIZ, null, null, new C1499505tx(String.valueOf(t.LLILII().LIZ.LIZ.getMsgId()), jSp, jCurrentTimeMillis2, null), 3);
        C1508705vR c1508705vR = C1508705vR.LL;
        C869590Y9l c869590Y9l = t.LLILII().LIZ.LIZ;
        c1508705vR.getClass();
        C054G c054g2 = C1508705vR.LLILLJJLI;
        C23250099c.LIZLLL(c054g2, null, null, new C1502805uU(c869590Y9l, null), 3);
        MarkdownMessageTemplate content = t.getContent();
        if (content != null && (str = content.raw) != null && a0.LJJIIZI(str, "smart-reply-sources", false)) {
            C869590Y9l c869590Y9l2 = t.LLILII().LIZ.LIZ;
            String conversationId = c869590Y9l2.getConversationId();
            C0Y8T c0y8tLJ = C0YNP.LIZIZ(conversationId).LJ();
            if (c0y8tLJ != null) {
                strLIZIZ = C1508705vR.LIZIZ(c0y8tLJ);
            }
            if (up()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C15392060w.LIZ.getClass();
            C23250099c.LIZLLL(c054g2, null, null, new C1499105tt("chat", strLIZIZ, str2, String.valueOf(C15392060w.LIZIZ(c869590Y9l2)), String.valueOf(C0YNP.LJII(conversationId)), conversationId, c869590Y9l2.getMsgId(), null), 3);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZSC c0zsc = (C0ZSC) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C461530I7z) it2.next()).LIZIZ);
            }
            ArrayList<C0ZSD> arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof C0ZSD) {
                    arrayList3.add(obj2);
                }
            }
            for (C0ZSD c0zsd : arrayList3) {
                if (c0zsd.LIZ) {
                    sp(c0zsc);
                }
                if (c0zsd.LIZIZ) {
                    op(c0zsc.LJII());
                }
            }
            return;
        }
        up(c0zsc);
    }
}
