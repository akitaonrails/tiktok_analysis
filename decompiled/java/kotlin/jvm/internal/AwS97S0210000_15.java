package kotlin.jvm.internal;

import X.C09AY;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C12ES;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C918130a03;
import X.C940770aaZ;
import X.C946980aka;
import X.C962250b9D;
import X.C963810bBj;
import X.C973660bRc;
import X.C974910bTd;
import X.C975250bUB;
import X.C976110bVZ;
import X.C978750bZp;
import X.C979070baL;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.EnumC975850bV9;
import X.EnumC976390bW1;
import X.InterfaceC963450bB9;
import X.InterfaceC973730bRj;
import Y.AAListenerS326S0100000_15;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptViewModel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceGameProgressChannel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS97S0210000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS97S0210000_15 awS97S0210000_15) {
        C979070baL.LIZLLL((DataChannel) awS97S0210000_15.l0, (EnumC975850bV9) awS97S0210000_15.l1, 0L, awS97S0210000_15.z2, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS97S0210000_15 awS97S0210000_15) {
        C978750bZp c978750bZp = (C978750bZp) awS97S0210000_15.l0;
        boolean z = awS97S0210000_15.z2;
        InterfaceC963450bB9 interfaceC963450bB9 = (InterfaceC963450bB9) awS97S0210000_15.l1;
        c978750bZp.getClass();
        C978750bZp.LIZLLL(z, interfaceC963450bB9);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS97S0210000_15 awS97S0210000_15) {
        if (awS97S0210000_15.z2) {
            ((MultiCoHostFollowPromptViewModel) awS97S0210000_15.l0).wQ2((C963810bBj) awS97S0210000_15.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS97S0210000_15 awS97S0210000_15) {
        Long lValueOf;
        List<TeamUsersInfo> listLJJJ;
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.RECEIVED;
        if (enumC964170bCJRY == enumC964170bCJ || C915980Zwa.LJFF().RY(true) == enumC964170bCJ) {
            C976110bVZ c976110bVZ = (C976110bVZ) awS97S0210000_15.l0;
            c976110bVZ.LJ.LJIIL(EnumC976390bW1.TIME_OUT, c976110bVZ.LJIIIIZZ, awS97S0210000_15.z2);
            C973660bRc c973660bRc = C973660bRc.LIZ;
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(awS97S0210000_15.z2);
            Integer numValueOf = null;
            if (interfaceC973730bRjYf2 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJIIJ());
            } else {
                lValueOf = null;
            }
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(awS97S0210000_15.z2);
            if (interfaceC973730bRjYf22 != null) {
                listLJJJ = interfaceC973730bRjYf22.LJJJ();
            } else {
                listLJJJ = null;
            }
            long j = ((C976110bVZ) awS97S0210000_15.l0).LJIIIIZZ;
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) awS97S0210000_15.l1;
            Map<Long, GiftGalleryBadgeInfo> map = linkMicBattleMessage.leagueInfoMap;
            boolean z = awS97S0210000_15.z2;
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
            if (battleSetting != null) {
                numValueOf = Integer.valueOf(battleSetting.battleType);
            }
            EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(numValueOf);
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            C973660bRc.LIZ.LJJLI(false, false, lValueOf, listLJJJ, j, map, z, C917350Zyn.LIZIZ(enumC919170a1jLIZ, size), null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS97S0210000_15 awS97S0210000_15) {
        Object parent;
        ViewGroup.LayoutParams layoutParams;
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1294720jnS composition;
        Rect rect;
        View view;
        if (awS97S0210000_15.z2) {
            C946980aka c946980aka = (C946980aka) awS97S0210000_15.l0;
            c946980aka.getClass();
            C20441214yg.LIZIZ("LetsDanceBackgroundEffectManager", "startPlayLetsDanceAnimation");
            C1295960jpS c1295960jpS = c946980aka.LLILLL;
            if (c1295960jpS != null) {
                C962250b9D.LJIIJ(c1295960jpS);
                c1295960jpS.addAnimatorListener(new AAListenerS326S0100000_15(c1295960jpS, 13));
                Rect rectLJJIIJ = C940770aaZ.LIZ().getDataSource().LJJIIJ();
                Rect rect2 = new Rect();
                C1295960jpS c1295960jpS2 = c946980aka.LLILLL;
                Float fValueOf = null;
                if (c1295960jpS2 != null) {
                    parent = c1295960jpS2.getParent();
                } else {
                    parent = null;
                }
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                    view.getGlobalVisibleRect(rect2);
                }
                C1295960jpS c1295960jpS3 = c946980aka.LLILLL;
                if (c1295960jpS3 != null) {
                    layoutParams = c1295960jpS3.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.width = rectLJJIIJ.width();
                    C1295960jpS c1295960jpS4 = c946980aka.LLILLL;
                    if (c1295960jpS4 != null && (composition = c1295960jpS4.getComposition()) != null && (rect = composition.LJIIIZ) != null) {
                        marginLayoutParams.height = (int) (rectLJJIIJ.width() * (rect.height() / (rect.width() + 0.0f)));
                    }
                    marginLayoutParams.leftMargin = rectLJJIIJ.left - rect2.left;
                    marginLayoutParams.rightMargin = rect2.right - rectLJJIIJ.right;
                    marginLayoutParams.topMargin = (rectLJJIIJ.top - rect2.top) - ((int) (((double) marginLayoutParams.height) * 0.42d));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateLetsDanceAnimationLayoutParams, (");
                    sbLIZ.append(marginLayoutParams.leftMargin);
                    sbLIZ.append(", ");
                    sbLIZ.append(marginLayoutParams.topMargin);
                    sbLIZ.append(", ");
                    sbLIZ.append(marginLayoutParams.leftMargin + marginLayoutParams.width);
                    sbLIZ.append(", ");
                    sbLIZ.append(marginLayoutParams.topMargin + marginLayoutParams.height);
                    sbLIZ.append(')');
                    C20441214yg.LIZIZ("LetsDanceBackgroundEffectManager", C2188811AlT.LIZIZ(sbLIZ));
                }
                C1295960jpS c1295960jpS5 = c946980aka.LLILLL;
                if (c1295960jpS5 != null) {
                    c1295960jpS5.requestLayout();
                }
                int i = MultiGuestSocialGameLetsDanceSetting.config().particleAnimationType;
                if (i != 1) {
                    if (i == 2) {
                        c1295960jpS.setRepeatCount(-1);
                    }
                } else {
                    c1295960jpS.setRepeatCount(0);
                    Integer num = (Integer) c946980aka.LL.gg0(MultiLetsDanceGameProgressChannel.class);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c1295960jpS.setProgress(iIntValue / 100.0f);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("startPlayLetsDanceAnimation, start_progress = ");
                C1295960jpS c1295960jpS6 = c946980aka.LLILLL;
                if (c1295960jpS6 != null) {
                    fValueOf = Float.valueOf(c1295960jpS6.getProgress());
                }
                sbLIZ2.append(fValueOf);
                C20441214yg.LJIIIZ("LetsDanceBackgroundEffectManager", C2188811AlT.LIZIZ(sbLIZ2));
                C12ES.LJIILL(0, c1295960jpS);
                c1295960jpS.playAnimation();
            }
        } else {
            C439101nJ.LJI((C1295960jpS) awS97S0210000_15.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$5(AwS97S0210000_15 awS97S0210000_15) {
        long channelId;
        Long lValueOf;
        List<TeamUsersInfo> listLJJJ;
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.RECEIVED;
        if (enumC964170bCJRY == enumC964170bCJ || C915980Zwa.LJFF().RY(true) == enumC964170bCJ) {
            boolean z = awS97S0210000_15.z2;
            C974910bTd c974910bTd = (C974910bTd) awS97S0210000_15.l0;
            C975250bUB c975250bUB = c974910bTd.LJ;
            EnumC976390bW1 enumC976390bW1 = EnumC976390bW1.TIME_OUT;
            long j = c974910bTd.LJIIIIZZ;
            BattleSetting battleSetting = ((LinkMicBattleMessage) awS97S0210000_15.l1).battleSetting;
            if (battleSetting != null) {
                channelId = battleSetting.channelId;
            } else {
                channelId = C915980Zwa.LJII().getChannelId();
            }
            c975250bUB.LJIIJJI(enumC976390bW1, j, channelId, z ? 1 : 0);
            C973660bRc c973660bRc = C973660bRc.LIZ;
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(awS97S0210000_15.z2);
            Integer numValueOf = null;
            if (interfaceC973730bRjYf2 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJIIJ());
            } else {
                lValueOf = null;
            }
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(awS97S0210000_15.z2);
            if (interfaceC973730bRjYf22 != null) {
                listLJJJ = interfaceC973730bRjYf22.LJJJ();
            } else {
                listLJJJ = null;
            }
            long j2 = ((C974910bTd) awS97S0210000_15.l0).LJIIIIZZ;
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) awS97S0210000_15.l1;
            Map<Long, GiftGalleryBadgeInfo> map = linkMicBattleMessage.leagueInfoMap;
            boolean z2 = awS97S0210000_15.z2;
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
            if (battleSetting2 != null) {
                numValueOf = Integer.valueOf(battleSetting2.battleType);
            }
            EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(numValueOf);
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            C973660bRc.LIZ.LJJLI(false, true, lValueOf, listLJJJ, j2, map, z2, C917350Zyn.LIZIZ(enumC919170a1jLIZ, size), null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0210000_15(C976110bVZ c976110bVZ, boolean z, LinkMicBattleMessage linkMicBattleMessage, int i) {
        super(0);
        this.$t = i;
        this.l0 = c976110bVZ;
        this.z2 = z;
        this.l1 = linkMicBattleMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0210000_15(C978750bZp c978750bZp, boolean z, InterfaceC963450bB9 interfaceC963450bB9, int i) {
        super(0);
        this.$t = i;
        this.l0 = c978750bZp;
        this.z2 = z;
        this.l1 = interfaceC963450bB9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0210000_15(boolean z, C946980aka c946980aka, C1295960jpS c1295960jpS, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c946980aka;
        this.l1 = c1295960jpS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0210000_15(boolean z, C974910bTd c974910bTd, LinkMicBattleMessage linkMicBattleMessage, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c974910bTd;
        this.l1 = linkMicBattleMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0210000_15(boolean z, MultiCoHostFollowPromptViewModel multiCoHostFollowPromptViewModel, C963810bBj c963810bBj, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = multiCoHostFollowPromptViewModel;
        this.l1 = c963810bBj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0210000_15(boolean z, DataChannel dataChannel, EnumC975850bV9 enumC975850bV9, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = dataChannel;
        this.l1 = enumC975850bV9;
    }
}
