package com.ss.android.ugc.aweme.im.chatlist.impl.feature.bubble;

import X.C053W;
import X.C12912053m;
import X.C12915053p;
import X.C12918053s;
import X.C1383370m6R;
import X.C1411505fl;
import X.C1954807lC;
import X.C461720I8s;
import X.EnumC12928054c;
import X.EnumC12929054d;
import X.EnumC1411605fm;
import X.EnumC1502105uN;
import X.InterfaceC1411705fn;
import X.InterfaceC1412005fq;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.bubble.ChatListBubbleService;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.List;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatListBubbleService implements InterfaceC1412005fq {
    public static boolean hasShownBubble;
    public static final ChatListBubbleService INSTANCE = new ChatListBubbleService();
    public static final int $stable = 8;

    @Override // X.InterfaceC1412005fq
    public boolean getHasShownBubble() {
        return hasShownBubble;
    }

    private final InterfaceC1411705fn getFrequencyControlUnit(String str) {
        return ((IFrequencyControlService) ServiceManager.get().getService(IFrequencyControlService.class)).LIZIZ(new C053W(str, new C12918053s(null, EnumC12928054c.UID, EnumC1502105uN.BUSINESS_ACCOUNT, EnumC12929054d.APP, 1), new C12912053m(1), C12915053p.LIZ));
    }

    private final String getFrequencyScene(EnumC1411605fm enumC1411605fm) {
        int i = C1411505fl.LIZ[enumC1411605fm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "creator_inbox_messaging_tool_chat_intro_show";
                }
                throw new C1954807lC();
            }
            return "inbox_messaging_tool_business_insights_show";
        }
        return "creator_inbox_messaging_tool_prompts_show";
    }

    private final String getGuideText(EnumC1411605fm enumC1411605fm) {
        int i = C1411505fl.LIZ[enumC1411605fm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C1383370m6R.LJIIJ(2131828567);
                }
                throw new C1954807lC();
            }
            return C1383370m6R.LJIIJ(2131830770);
        }
        return C1383370m6R.LJIIJ(2131827459);
    }

    @Override // X.InterfaceC1412005fq
    public void setHasShownBubble(boolean z) {
        hasShownBubble = z;
    }

    @Override // X.InterfaceC1412005fq
    public void showGuideBubbleForMessagingTool(final Context context, final View view, List<? extends EnumC1411605fm> list) {
        long jCurrentTimeMillis;
        for (EnumC1411605fm enumC1411605fm : list) {
            ChatListBubbleService chatListBubbleService = INSTANCE;
            final InterfaceC1411705fn frequencyControlUnit = chatListBubbleService.getFrequencyControlUnit(chatListBubbleService.getFrequencyScene(enumC1411605fm));
            String strLIZIZ = C461720I8s.LIZIZ();
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi != null) {
                jCurrentTimeMillis = iMHostApi.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (!frequencyControlUnit.LIZIZ(jCurrentTimeMillis, strLIZIZ)) {
                final String guideText = chatListBubbleService.getGuideText(enumC1411605fm);
                HandlerHook.viewPost(view, new Runnable() { // from class: X.0HXc
                    public final void LIZ() {
                        if (ChatListBubbleService.INSTANCE.getHasShownBubble() || view.getParent() == null) {
                            return;
                        }
                        if (C442590HXd.LIZ) {
                            if (C442590HXd.LIZIZ != null) {
                                return;
                            } else {
                                C442590HXd.LIZIZ = "im_bubble";
                            }
                        }
                        C450720Hlu c450720Hlu = new C450720Hlu(context);
                        View view2 = view;
                        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                        c1391600mJi.LIZIZ = view2;
                        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                        c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        c450720Hlu.LLILZ = guideText;
                        c450720Hlu.LJ(new AwS546S0100000_2(frequencyControlUnit, 340));
                        c450720Hlu.LIZIZ().show();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ChatListBubbleService@1fa9.showGuideBubbleForMessagingTool$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ChatListBubbleService@1fa9.showGuideBubbleForMessagingTool$1$1");
                    }
                });
                return;
            }
        }
    }
}
