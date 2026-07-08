package com.ss.android.ugc.aweme.im.saas.host.impl.im.sticker;

import X.AbstractC19589811ke;
import X.C0C64;
import X.C0PEM;
import X.C1228470i4b;
import X.C1228650i4t;
import X.C1228810i59;
import X.C1229270i5t;
import X.C1229770i6h;
import X.C1229870i6r;
import X.C1230910i8X;
import X.C1251350ifV;
import X.C1618506Vj;
import X.C19619711pT;
import X.C19619911pV;
import X.C2095008Iq;
import X.C2296808zG;
import X.C23250099c;
import X.C294790Bgz;
import X.C390410FSl;
import X.C390420FSm;
import X.C461720I8s;
import X.C497820Jfg;
import X.C911510ZpN;
import X.EnumC1219960hqs;
import X.EnumC1228720i50;
import X.EnumC1228830i5B;
import X.EnumC1229950i6z;
import X.EnumC1230920i8Y;
import X.EnumC911440ZpG;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupChatStickerServiceImpl implements IGroupChatStickerApi {
    public static EnumC911440ZpG LJIIIIZZ() {
        return C294790Bgz.LIZ() ? EnumC911440ZpG.ALL_PUBLIC_GROUP : EnumC911440ZpG.FAN_GROUP_ONLY;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    public final void LIZIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C911510ZpN(LJIIIIZZ(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    public final boolean LIZLLL() {
        return C294790Bgz.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    public final Class<? extends AbstractC19589811ke<?>> LJI() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "im_group_chat_sticker_entrance", false, false) || C294790Bgz.LIZ()) {
            return C19619711pT.class;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    public final boolean LJ(boolean z) {
        if (z) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "im_group_chat_sticker_entrance", false, false);
        }
        return C294790Bgz.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    public final boolean LJFF(String str) {
        EnumC911440ZpG enumC911440ZpGLJIIIIZZ = LJIIIIZZ();
        String strLIZIZ = C461720I8s.LIZIZ();
        List<GroupPreviewDisplayMeta> listLIZIZ = C1229870i6r.LIZIZ(strLIZIZ, strLIZIZ, enumC911440ZpGLJIIIIZZ);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL == null) {
            if (listLIZIZ.size() <= 1) {
                return false;
            }
        } else {
            if ((listLIZIZ instanceof Collection) && listLIZIZ.isEmpty()) {
                return false;
            }
            Iterator<GroupPreviewDisplayMeta> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next().groupInfo.convShortId != lLJIILIIL.longValue()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r9, X.InterfaceC1364105Vn<? super X.C0V03> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C058D
            if (r0 == 0) goto L77
            r6 = r10
            X.058D r6 = (X.C058D) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r7 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 != r3) goto L7d
            X.C155000ia.LIZIZ(r7)
        L23:
            kotlin.Pair r7 = (kotlin.Pair) r7
            X.0V03 r2 = new X.0V03
            if (r7 == 0) goto L41
            java.lang.Object r0 = r7.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            java.lang.Object r0 = r7.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
        L3d:
            r2.<init>(r1, r4)
            return r2
        L41:
            r1 = 0
            goto L3d
        L43:
            X.C155000ia.LIZIZ(r7)
            if (r9 == 0) goto L5c
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "im_group_chat_sticker_entrance"
            boolean r0 = r2.LJIIIZ(r1, r0, r4, r4)
            if (r0 != 0) goto L62
        L56:
            X.0V03 r0 = new X.0V03
            r0.<init>(r4, r4)
            return r0
        L5c:
            boolean r0 = X.C294790Bgz.LIZ()
            if (r0 == 0) goto L56
        L62:
            boolean r0 = X.C461720I8s.LJ()
            if (r0 == 0) goto L56
            X.0i6r r1 = X.C1229870i6r.LIZ
            X.0ZpG r0 = LJIIIIZZ()
            r6.LLILLL = r3
            java.lang.Object r7 = r1.LIZLLL(r0, r6)
            if (r7 != r5) goto L23
            return r5
        L77:
            X.058D r6 = new X.058D
            r6.<init>(r8, r10)
            goto L12
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.im.sticker.GroupChatStickerServiceImpl.LIZ(boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    public final void LIZJ(Context context, boolean z, Function1 function1, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getValue();
            if (str2 != null && str2.length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!z) {
            String strLIZIZ = C461720I8s.LIZIZ();
            List<GroupPreviewDisplayMeta> listLIZIZ = C1229870i6r.LIZIZ(strLIZIZ, strLIZIZ, LJIIIIZZ());
            if (listLIZIZ.size() == 1) {
                function1.invoke(C1229770i6h.LIZ((GroupPreviewDisplayMeta) ListProtector.get(listLIZIZ, 0)));
                return;
            }
        }
        if (C294790Bgz.LIZ()) {
            C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "", "").LJFF(context, new C1228470i4b(new C1228650i4t(null, null, null, null, 0, null, false, null, null, false, null, false, null, null, null, null, 0, 0, false, null, null, null, -1, 1), new C1228810i59("video_edit_page", str, C461720I8s.LIZIZ(), false, true, null, 0L, null, EnumC1228830i5B.STICKER_CHOOSE_GROUP, linkedHashMap, 0, null, null, null, null, new AwS668S0100000_19(function1, (Function1<? super DMGroupChatStickerGroupInfo, Unit>) 55), false, null, new C1229270i5t(0, false, Float.valueOf(0.9f), null, null, null, R.attr.a1b, null, 741), 1832160)));
            return;
        }
        int value = EnumC1229950i6z.SELECT_STYLE.getValue();
        C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "", "").LIZJ(context, C461720I8s.LIZIZ(), new C1230910i8X("video_edit_page", str, 0, "", EnumC1219960hqs.UNKNOWN.getValue(), EnumC1219960hqs.UNKNOWN.getValue(), Integer.valueOf((int) (C497820Jfg.LIZ(context) * 0.7f)), EnumC1228720i50.CHAT_ROOM.getValue(), EnumC1230920i8Y.DEFAULT.getValue(), "", 1, false, true, value, System.currentTimeMillis(), true, false, null, null, null, null), new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 853));
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi
    public final C19619911pV LJII(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm, Function0 function0) {
        return new C19619911pV(context, frameLayout, frameLayout2, lifecycleOwner, C390410FSl.LIZIZ(c390420FSm), c390420FSm, function0);
    }
}
