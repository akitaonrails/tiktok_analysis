package kotlin.jvm.internal;

import X.AbstractC1080560eE2;
import X.C013C;
import X.C09AY;
import X.C1081610eFj;
import X.C1081620eFk;
import X.C1081680eFq;
import X.C1144970ftv;
import X.C1294320jmo;
import X.C1294720jnS;
import X.C20441214yg;
import X.C259800zU;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS34S0600000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS34S0600000_17 awS34S0600000_17, Object obj) {
        C1294320jmo c1294320jmo;
        String str;
        String str2;
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        try {
            if (((ImageModel) awS34S0600000_17.l0) != null) {
                Map<String, C1294320jmo> map = c1294720jnS.LIZLLL;
                int i = ((ItemInfo4FE) awS34S0600000_17.l1).itemType;
                C1294320jmo c1294320jmo2 = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 7 && i != 8) {
                                    if (i != 9) {
                                        c1294320jmo = null;
                                    } else {
                                        c1294320jmo = map.get("image_134");
                                    }
                                } else {
                                    c1294320jmo = map.get("image_104");
                                }
                            } else {
                                C1144970ftv c1144970ftv = (C1144970ftv) awS34S0600000_17.l2;
                                if (c1144970ftv == null || (str2 = c1144970ftv.LIZJ) == null) {
                                    str2 = "image_88";
                                }
                                c1294320jmo = map.get(str2);
                            }
                        } else {
                            c1294320jmo = map.get("image_1");
                        }
                    } else {
                        c1294320jmo = map.get("image_95");
                    }
                } else {
                    c1294320jmo = map.get("image_61");
                }
                MatchItemEnterAnimAssem matchItemEnterAnimAssem = (MatchItemEnterAnimAssem) awS34S0600000_17.l3;
                Bitmap bitmap = (Bitmap) awS34S0600000_17.l4;
                boolean z = ((ItemInfo4FE) awS34S0600000_17.l1).isTeamMate;
                matchItemEnterAnimAssem.getClass();
                MatchItemEnterAnimAssem.No(bitmap, c1294320jmo, true, z);
                int i2 = ((ItemInfo4FE) awS34S0600000_17.l1).itemType;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 7 && i2 != 8) {
                                    if (i2 == 9) {
                                        c1294320jmo2 = map.get("image_133");
                                    }
                                } else {
                                    c1294320jmo2 = map.get("image_101");
                                }
                            } else {
                                C1144970ftv c1144970ftv2 = (C1144970ftv) awS34S0600000_17.l2;
                                if (c1144970ftv2 == null || (str = c1144970ftv2.LIZLLL) == null) {
                                    str = "image_87";
                                }
                                c1294320jmo2 = map.get(str);
                            }
                        } else {
                            c1294320jmo2 = map.get("image_0");
                        }
                    } else {
                        c1294320jmo2 = map.get("image_94");
                    }
                } else {
                    c1294320jmo2 = map.get("image_60");
                }
                MatchItemEnterAnimAssem matchItemEnterAnimAssem2 = (MatchItemEnterAnimAssem) awS34S0600000_17.l3;
                Bitmap bitmap2 = (Bitmap) awS34S0600000_17.l5;
                boolean z2 = ((ItemInfo4FE) awS34S0600000_17.l1).isTeamMate;
                matchItemEnterAnimAssem2.getClass();
                MatchItemEnterAnimAssem.No(bitmap2, c1294320jmo2, false, z2);
                int i3 = ((ItemInfo4FE) awS34S0600000_17.l1).itemType;
                if (i3 == 7 || i3 == 8) {
                    MatchItemEnterAnimAssem matchItemEnterAnimAssem3 = (MatchItemEnterAnimAssem) awS34S0600000_17.l3;
                    Bitmap bitmap3 = (Bitmap) awS34S0600000_17.l4;
                    C1294320jmo c1294320jmo3 = map.get("image_103");
                    boolean z3 = ((ItemInfo4FE) awS34S0600000_17.l1).isTeamMate;
                    matchItemEnterAnimAssem3.getClass();
                    MatchItemEnterAnimAssem.No(bitmap3, c1294320jmo3, true, z3);
                    MatchItemEnterAnimAssem matchItemEnterAnimAssem4 = (MatchItemEnterAnimAssem) awS34S0600000_17.l3;
                    Bitmap bitmap4 = (Bitmap) awS34S0600000_17.l5;
                    C1294320jmo c1294320jmo4 = map.get("image_102");
                    boolean z4 = ((ItemInfo4FE) awS34S0600000_17.l1).isTeamMate;
                    matchItemEnterAnimAssem4.getClass();
                    MatchItemEnterAnimAssem.No(bitmap4, c1294320jmo4, false, z4);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("MatchItemEnterAnim", "use match item anim ", e);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.0eFq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS34S0600000_17 r8, java.lang.Object r9) {
        /*
            java.lang.Object r1 = r8.l0
            X.013C r1 = (X.C013C) r1
            java.lang.Object r0 = r8.l1
            X.0eE2 r0 = (X.AbstractC1080560eE2) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.getDataChannel()
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r2.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            r3 = 0
            if (r2 == 0) goto Lb2
            long r6 = r2.multiStreamScene
            r4 = 1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb2
            com.bytedance.android.livesdkapi.depend.model.live.StreamUrl r0 = r2.multiStreamUrl
            if (r0 == 0) goto Lb0
            com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData r0 = r0.liveCoreSDKData
            if (r0 == 0) goto Lb0
            com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData$PullData r0 = r0.getPullData()
            if (r0 == 0) goto Lb0
            java.lang.String r0 = r0.getStreamData()
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb2
            com.bytedance.android.livesdkapi.depend.model.live.StreamUrl r0 = r2.multiStreamUrl
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData r0 = r0.liveCoreSDKData
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData$Quality r0 = r0.getDefaultQuality()
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.sdkKey
        L47:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb2
            r0 = 1
        L4e:
            r1.element = r0
            java.lang.Object r2 = r8.l2
            X.00zU r2 = (X.C259800zU) r2
            com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch.INSTANCE
            boolean r0 = r0.isExperimentGroup()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r8.l0
            X.013C r0 = (X.C013C) r0
            boolean r0 = r0.element
            if (r0 == 0) goto Lac
            X.0eFk r1 = new X.0eFk
            java.lang.Object r0 = r8.l1
            X.0eE2 r0 = (X.AbstractC1080560eE2) r0
            r1.<init>(r0)
        L6d:
            r2.element = r1
            java.lang.Object r2 = r8.l3
            X.00zU r2 = (X.C259800zU) r2
            android.graphics.Rect r0 = X.C464030IHp.LJIIIZ
            java.lang.Object r0 = r8.l1
            X.0eE2 r0 = (X.AbstractC1080560eE2) r0
            if (r0 == 0) goto Laa
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.getDataChannel()
        L7f:
            boolean r0 = X.C0IKK.LIZ(r0)
            if (r0 == 0) goto La8
            X.0eFj r1 = new X.0eFj
            java.lang.Object r0 = r8.l1
            X.0eE2 r0 = (X.AbstractC1080560eE2) r0
            r1.<init>(r0)
        L8e:
            r2.element = r1
            java.lang.Object r2 = r8.l4
            X.00zU r2 = (X.C259800zU) r2
            X.0eFq r1 = new X.0eFq
            java.lang.Object r0 = r8.l1
            X.0eE2 r0 = (X.AbstractC1080560eE2) r0
            r1.<init>(r0)
            r2.element = r1
            java.lang.Object r0 = r8.l5
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r3
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La8:
            r1 = r3
            goto L8e
        Laa:
            r0 = r3
            goto L7f
        Lac:
            r1 = r3
            goto L6d
        Lae:
            r0 = r3
            goto L47
        Lb0:
            r0 = r3
            goto L31
        Lb2:
            r0 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS34S0600000_17.invoke$1(kotlin.jvm.internal.AwS34S0600000_17, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS34S0600000_17(C013C c013c, C013C c013c2, AbstractC1080560eE2 abstractC1080560eE2, C259800zU<C1081620eFk> c259800zU, C259800zU<C1081610eFj> c259800zU2, C259800zU<C1081680eFq> c259800zU3, C259800zU<Boolean> c259800zU4) {
        super(1);
        this.$t = c259800zU4;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = abstractC1080560eE2;
        this.l3 = c259800zU;
        this.l4 = c259800zU2;
        this.l5 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0600000_17(ImageModel imageModel, ItemInfo4FE itemInfo4FE, C1144970ftv c1144970ftv, MatchItemEnterAnimAssem matchItemEnterAnimAssem, Bitmap bitmap, Bitmap bitmap2, int i) {
        super(1);
        this.$t = i;
        this.l0 = imageModel;
        this.l1 = itemInfo4FE;
        this.l2 = c1144970ftv;
        this.l3 = matchItemEnterAnimAssem;
        this.l4 = bitmap;
        this.l5 = bitmap2;
    }
}
