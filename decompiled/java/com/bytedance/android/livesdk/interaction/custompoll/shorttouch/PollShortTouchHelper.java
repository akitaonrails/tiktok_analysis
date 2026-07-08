package com.bytedance.android.livesdk.interaction.custompoll.shorttouch;

import X.C01C1;
import X.C01C5;
import X.C0IJT;
import X.C1086960eOM;
import X.C1161920gLG;
import X.C20441214yg;
import X.C474500IjA;
import X.C500260Jjc;
import X.InterfaceC1085330eLj;
import X.InterfaceC1087010eOR;
import X.InterfaceC1101720emA;
import Y.ALAdapterS13S0100000_17;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.livesetting.roomfunction.PollShortTouchUrl;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting;
import com.bytedance.android.livesdk.livesetting.subscription.EmotePollShortTouchUrl;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class PollShortTouchHelper {
    public static String LIZ = "";
    public static long LIZIZ = -1;
    public static String LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri.Builder LIZ(android.net.Uri.Builder r9, com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.custompoll.shorttouch.PollShortTouchHelper.LIZ(android.net.Uri$Builder, com.bytedance.ies.sdk.datachannel.DataChannel):android.net.Uri$Builder");
    }

    public static void LIZIZ(Room room, long j, C01C1 c01c1, DataChannel dataChannel) {
        PollMessage pollMessage;
        final Context context;
        int i;
        InterfaceC1101720emA interfaceC1101720emA;
        InterfaceC1085330eLj interfaceC1085330eLjVd;
        Integer num;
        String str;
        PollMessage pollMessage2;
        Integer num2;
        if (!LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework() || (pollMessage2 = c01c1.LJFF) == null || (num2 = pollMessage2.pollKind) == null || num2.intValue() != 2 || (dataChannel != null && C500260Jjc.LJJJIL(dataChannel))) {
            C1086960eOM.LL.getClass();
            Integer num3 = C1086960eOM.LLILZ.get(j);
            if ((num3 == null || num3.intValue() != 1) && C1086960eOM.LLJJJJ && (pollMessage = c01c1.LJFF) != null && (context = C1086960eOM.LLJI) != null) {
                long j2 = -1;
                if (c01c1.LIZIZ != -1) {
                    j2 = c01c1.LIZJ;
                }
                InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
                Integer num4 = pollMessage.pollKind;
                if (num4 != null && num4.intValue() == 5) {
                    if (C500260Jjc.LJIIZILJ(dataChannel)) {
                        str = "anchor";
                    } else if (C01C5.LIZ(dataChannel)) {
                        str = "moderator";
                    } else {
                        str = "audience";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_emote_poll_card_show");
                    c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
                    c474500IjALIZ.LJJII(String.valueOf(pollMessage.pollId), "poll_id");
                    c474500IjALIZ.LJJII(str, "user_type");
                    c474500IjALIZ.LIZ();
                    interfaceC1101720emA = null;
                    i = 5;
                    interfaceC1085330eLjVd = interfaceC1087010eOR.Vd(C1086960eOM.LLJI, UriProtector.parse(EmotePollShortTouchUrl.INSTANCE.getUrl()).buildUpon().appendQueryParameter("poll_end_time", String.valueOf(j2)).appendQueryParameter("room_id", String.valueOf(j)).appendQueryParameter("anchor_id", String.valueOf(room.getOwnerUserId())).appendQueryParameter("poll_id", String.valueOf(pollMessage.pollId)).appendQueryParameter("user_type", str).build(), null, "shortTouchCustomPoll", null, false);
                } else {
                    i = 5;
                    interfaceC1101720emA = null;
                    interfaceC1085330eLjVd = interfaceC1087010eOR.Vd(C1086960eOM.LLJI, UriProtector.parse(PollShortTouchUrl.INSTANCE.getUrl()).buildUpon().appendQueryParameter("poll_end_time", String.valueOf(j2)).appendQueryParameter("poll_id", String.valueOf(pollMessage.pollId)).build(), null, "shortTouchCustomPoll", null, false);
                }
                if (interfaceC1085330eLjVd != null) {
                    PollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1 pollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1 = new PollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1(interfaceC1085330eLjVd, j, c01c1);
                    if (!c01c1.LJII) {
                        C20441214yg.LIZIZ("PollShortTouchHelper", "add Touch with preview");
                        PollMessage pollMessage3 = c01c1.LJFF;
                        if (pollMessage3 != null && (num = pollMessage3.pollKind) != null && num.intValue() == i) {
                            interfaceC1087010eOR.Yd(pollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1, new InterfaceC1101720emA(context) { // from class: X.0eie
                                public final C1324720kZq LIZ;

                                @Override // X.InterfaceC1101720emA
                                public final void LJLJL() {
                                }

                                @Override // X.InterfaceC1101720emA
                                public final void LLLZI() {
                                }

                                @Override // X.InterfaceC1101720emA
                                public final boolean Ur() {
                                    return true;
                                }

                                @Override // X.InterfaceC1101720emA
                                public final int Vr() {
                                    return 0;
                                }

                                @Override // X.InterfaceC1101720emA
                                public final View LLLILZJ() {
                                    C1324720kZq c1324720kZq = this.LIZ;
                                    C786410Ut5.u6(c1324720kZq, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(70.0f), (int) C497740JfY.LIZIZ(70.0f)));
                                    return c1324720kZq;
                                }

                                @Override // X.InterfaceC1101720emA
                                public final String Sr() {
                                    return C1099470eiX.LIZ(this);
                                }

                                {
                                    this.LIZ = new C1324720kZq(context);
                                    C1143680frq.LJFF(this.LIZ, "tiktok_live_subscription_demand_1", "ttlive_subscription_emote_poll_short_touch_big_icon.png", ImageView.ScaleType.CENTER_CROP, new InterfaceC1142670fqD() { // from class: X.0eid
                                        public long LIZ = System.currentTimeMillis();

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZIZ(Animatable animatable) {
                                        }

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZ() {
                                            this.LIZ = System.currentTimeMillis();
                                        }

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZLLL(String str2, Exception exc) {
                                            C1099540eie c1099540eie = this.LIZIZ;
                                            c1099540eie.getClass();
                                            C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1099470eiX.LIZ(c1099540eie));
                                            if (c1101820emKLIZIZ != null) {
                                                c1101820emKLIZIZ.LIZJ = 1;
                                            }
                                        }

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZJ(int i2, int i3, String str2) {
                                            C1099540eie c1099540eie = this.LIZIZ;
                                            c1099540eie.getClass();
                                            C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1099470eiX.LIZ(c1099540eie));
                                            if (c1101820emKLIZIZ != null) {
                                                c1101820emKLIZIZ.LIZLLL = System.currentTimeMillis() - this.LIZ;
                                            }
                                        }
                                    });
                                }

                                @Override // X.InterfaceC1101720emA
                                public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                                    final Animator animatorRb0 = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).rb0(viewGroup, z);
                                    if (animatorRb0 != null) {
                                        animatorRb0.addListener(new ALAdapterS13S0100000_17(viewGroup, 88));
                                    } else {
                                        animatorRb0 = null;
                                    }
                                    return new InterfaceC1101940emW() { // from class: X.0eif
                                        @Override // X.InterfaceC1101940emW
                                        public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                                            return new AwS596S0100000_17(animatorRb0, 658);
                                        }

                                        @Override // X.InterfaceC1101940emW
                                        public final void LIZIZ() {
                                            Animator animator = animatorRb0;
                                            if (animator != null) {
                                                animator.cancel();
                                            }
                                        }

                                        @Override // X.InterfaceC1101940emW
                                        public final void LIZJ() {
                                            Animator animator = animatorRb0;
                                            if (animator != null) {
                                                animator.start();
                                            }
                                        }

                                        @Override // X.InterfaceC1101940emW
                                        public final boolean isRunning() {
                                            Animator animator = animatorRb0;
                                            return C500260Jjc.LJJJI(animator != null ? Boolean.valueOf(animator.isRunning()) : null);
                                        }
                                    };
                                }
                            });
                        } else {
                            interfaceC1087010eOR.Yd(pollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1, new InterfaceC1101720emA(context) { // from class: X.0eiZ
                                public final C1324720kZq LIZ;

                                @Override // X.InterfaceC1101720emA
                                public final void LJLJL() {
                                }

                                @Override // X.InterfaceC1101720emA
                                public final void LLLZI() {
                                }

                                @Override // X.InterfaceC1101720emA
                                public final boolean Ur() {
                                    return true;
                                }

                                @Override // X.InterfaceC1101720emA
                                public final int Vr() {
                                    return 0;
                                }

                                @Override // X.InterfaceC1101720emA
                                public final View LLLILZJ() {
                                    C1324720kZq c1324720kZq = this.LIZ;
                                    C786410Ut5.u6(c1324720kZq, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(70.0f), (int) C497740JfY.LIZIZ(70.0f)));
                                    return c1324720kZq;
                                }

                                @Override // X.InterfaceC1101720emA
                                public final String Sr() {
                                    return C1099470eiX.LIZ(this);
                                }

                                {
                                    this.LIZ = new C1324720kZq(context);
                                    C1143680frq.LJFF(this.LIZ, "tiktok_live_watch_resource_demand_1", "ttlive_custom_poll_short_touch_big_icon.png", ImageView.ScaleType.CENTER_CROP, new InterfaceC1142670fqD() { // from class: X.0eiY
                                        public long LIZ = System.currentTimeMillis();

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZIZ(Animatable animatable) {
                                        }

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZ() {
                                            this.LIZ = System.currentTimeMillis();
                                        }

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZLLL(String str2, Exception exc) {
                                            C1099490eiZ c1099490eiZ = this.LIZIZ;
                                            c1099490eiZ.getClass();
                                            C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1099470eiX.LIZ(c1099490eiZ));
                                            if (c1101820emKLIZIZ != null) {
                                                c1101820emKLIZIZ.LIZJ = 1;
                                            }
                                        }

                                        @Override // X.InterfaceC1142670fqD
                                        public final void LIZJ(int i2, int i3, String str2) {
                                            C1099490eiZ c1099490eiZ = this.LIZIZ;
                                            c1099490eiZ.getClass();
                                            C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1099470eiX.LIZ(c1099490eiZ));
                                            if (c1101820emKLIZIZ != null) {
                                                c1101820emKLIZIZ.LIZLLL = System.currentTimeMillis() - this.LIZ;
                                            }
                                        }
                                    });
                                }

                                @Override // X.InterfaceC1101720emA
                                public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                                    final Animator animatorRb0 = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).rb0(viewGroup, z);
                                    if (animatorRb0 != null) {
                                        animatorRb0.addListener(new ALAdapterS13S0100000_17(viewGroup, 87));
                                    } else {
                                        animatorRb0 = null;
                                    }
                                    return new InterfaceC1101940emW() { // from class: X.0eia
                                        @Override // X.InterfaceC1101940emW
                                        public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                                            return new AwS596S0100000_17(animatorRb0, 657);
                                        }

                                        @Override // X.InterfaceC1101940emW
                                        public final void LIZIZ() {
                                            Animator animator = animatorRb0;
                                            if (animator != null) {
                                                animator.cancel();
                                            }
                                        }

                                        @Override // X.InterfaceC1101940emW
                                        public final void LIZJ() {
                                            Animator animator = animatorRb0;
                                            if (animator != null) {
                                                animator.start();
                                            }
                                        }

                                        @Override // X.InterfaceC1101940emW
                                        public final boolean isRunning() {
                                            Animator animator = animatorRb0;
                                            return C500260Jjc.LJJJI(animator != null ? Boolean.valueOf(animator.isRunning()) : null);
                                        }
                                    };
                                }
                            });
                        }
                        c01c1.LJII = true;
                        return;
                    }
                    C20441214yg.LIZIZ("PollShortTouchHelper", "add Touch without preview");
                    interfaceC1087010eOR.Yd(pollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1, interfaceC1101720emA);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(long r22, X.C01C1 r24, com.bytedance.ies.sdk.datachannel.DataChannel r25, boolean r26, java.lang.Runnable r27) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.custompoll.shorttouch.PollShortTouchHelper.LIZJ(long, X.01C1, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, java.lang.Runnable):void");
    }
}
