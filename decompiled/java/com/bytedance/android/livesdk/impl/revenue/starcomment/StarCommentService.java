package com.bytedance.android.livesdk.impl.revenue.starcomment;

import X.C1116230f9Z;
import X.C1116310f9h;
import X.C1116330f9j;
import X.C1116420f9s;
import X.C1161920gLG;
import X.C19748512Ol;
import X.InterfaceC1109090ey3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.landscape.LandscapeStarCommentIconWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public class StarCommentService implements IStarCommentService {
    public boolean LL;

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final StarCommentExtendWidget RR0() {
        return new StarCommentExtendWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final void initPublicScreenConfiguration() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).jc0(new InterfaceC1109090ey3() { // from class: X.0eyU
            @Override // X.InterfaceC1109090ey3
            public final void LIZ() {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LIZIZ(C1109430eyb c1109430eyb) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LJ(AbstractC1111600f26 abstractC1111600f26) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LJFF(InterfaceC1109340eyS interfaceC1109340eyS) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LIZJ(C1109030exx c1109030exx) {
                C1109030exx.LIZIZ(new InterfaceC1109140ey8() { // from class: X.0Unv
                    @Override // X.InterfaceC1109140ey8
                    public final int LIZLLL() {
                        return 1;
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final int LJ() {
                        return 15;
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final boolean LJIILIIL() {
                        return ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).xn0();
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final boolean LIZ(Room room) {
                        return ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).ce0(room);
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final void LIZJ(C1109770ez9 c1109770ez9) {
                        C782110Um9 c782110Um9 = new C782110Um9(c1109770ez9.LIZ);
                        c782110Um9.LJIIZILJ(2131844136);
                        c782110Um9.LJII(2131844134);
                        c782110Um9.LJIIL(2131844135);
                        C786410Ut5.E4(c782110Um9.LIZ());
                        DataChannel dataChannel = c1109770ez9.LJIIIZ;
                        if (dataChannel != null) {
                            LJFF(dataChannel, "pin@star");
                        }
                    }

                    public static void LJFF(DataChannel dataChannel, String str) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_pin_cover");
                        c474500IjALIZ.LJIJJLI(dataChannel);
                        if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.FALSE)) {
                            c474500IjALIZ.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).WS1()), "user_rank");
                        }
                        c474500IjALIZ.LJJII(str, "order");
                        c474500IjALIZ.LIZ();
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final void LIZIZ(DataChannel dataChannel, C1109020exw c1109020exw, C1109020exw c1109020exw2) {
                        User user;
                        User user2;
                        if ((c1109020exw != null && (user2 = c1109020exw.LIZIZ) != null && user2.getId() == UserService.getInstance().user().getCurrentUserId()) || (c1109020exw2 != null && (user = c1109020exw2.LIZIZ) != null && user.getId() == UserService.getInstance().user().getCurrentUserId())) {
                            LJFF(dataChannel, "star@pin");
                        }
                    }
                });
            }

            @Override // X.InterfaceC1109090ey3
            public final void LIZLLL(InterfaceC1109320eyQ interfaceC1109320eyQ) {
                interfaceC1109320eyQ.LIZIZ(C1116210f9X.class, new InterfaceC1109180eyC<C1116210f9X>() { // from class: X.0eyX
                    @Override // X.InterfaceC1109180eyC
                    public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                        return new C1110190ezp((C1116210f9X) abstractC1136060ffY);
                    }
                });
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [X.0eyW] */
            @Override // X.InterfaceC1109090ey3
            public final void LJI(InterfaceC1109350eyT interfaceC1109350eyT) {
                interfaceC1109350eyT.LIZ(C1110190ezp.class, new InterfaceC1109750ez7<C1110190ezp, C1109400eyY>() { // from class: X.0eyW
                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eyY] */
                    @Override // X.InterfaceC1109750ez7
                    public final C1109400eyY LIZ(InterfaceC1112060f2q interfaceC1112060f2q) {
                        final C1110190ezp c1110190ezp = (C1110190ezp) interfaceC1112060f2q;
                        return new C1109600eys<C1110190ezp>(c1110190ezp) { // from class: X.0eyY
                        };
                    }
                });
            }

            @Override // X.InterfaceC1109090ey3
            public final void LJII(AbstractC1109730ez5 abstractC1109730ez5) {
                abstractC1109730ez5.LLLIIIIL(C1109400eyY.class, new AbstractC1109740ez6<C1110190ezp, C1109400eyY, C1110100ezg>() { // from class: X.0eyV
                    @Override // X.C0J8P
                    public final RecyclerView.ViewHolder LJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        if (LJIIIIZZ().LJJ) {
                            return new C1110100ezg(C786410Ut5.Td(layoutInflater, R.layout.h4v, viewGroup, false), LJIIIIZZ());
                        }
                        if (LJIIIIZZ().LIZLLL) {
                            return new C1110100ezg(C786410Ut5.Td(layoutInflater, R.layout.h4u, viewGroup, false), LJIIIIZZ());
                        }
                        return new C1110100ezg(C786410Ut5.Td(layoutInflater, R.layout.h4w, viewGroup, false), LJIIIIZZ());
                    }
                });
            }
        });
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final StarCommentPaymentDialog xc1() {
        C1116330f9j c1116330f9j = new C1116330f9j("regular_entrance", "", null);
        StarCommentPaymentDialog starCommentPaymentDialog = new StarCommentPaymentDialog();
        starCommentPaymentDialog.LLLFZ = "regular_entrance";
        starCommentPaymentDialog.LLLI = c1116330f9j;
        return starCommentPaymentDialog;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final Class<? extends LiveRecyclableWidget> B52() {
        return LandscapeStarCommentIconWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean J22() {
        return C1116310f9h.LIZJ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final int VC2() {
        return C1116310f9h.LIZLLL;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean pd0() {
        return C1116310f9h.LJ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean xn0() {
        return C1116420f9s.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E00(com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            r9 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r5 = r10.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r5
            java.lang.Class<X.0ezh> r0 = X.C1110110ezh.class
            java.lang.Object r0 = r10.gg0(r0)
            X.0f9f r0 = (X.InterfaceC1116290f9f) r0
            r6 = 0
            if (r0 == 0) goto Lba
            int r0 = r0.LIZIZ()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L20:
            if (r5 == 0) goto Lb7
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.getStreamType()
        L26:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r7 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r0 != r7) goto L37
            com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentEnableSetting r0 = com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentEnableSetting.INSTANCE
            boolean r0 = r0.getSettingValue()
            if (r0 != 0) goto L37
            java.lang.String r0 = "setting_not_enable"
            r4.add(r0)
        L37:
            if (r5 == 0) goto Lb5
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.getStreamType()
        L3d:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r3 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r0 != r3) goto L4e
            com.bytedance.android.livesdk.livesetting.starcomment.GameLiveStarCommentEnableSetting r0 = com.bytedance.android.livesdk.livesetting.starcomment.GameLiveStarCommentEnableSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 != 0) goto L4e
            java.lang.String r0 = "game_live_setting_not_enable"
            r4.add(r0)
        L4e:
            if (r5 == 0) goto Lb3
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.getStreamType()
        L54:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r2 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            if (r0 != r2) goto L65
            com.bytedance.android.livesdk.livesetting.starcomment.LSStarCommentProtectSetting r0 = com.bytedance.android.livesdk.livesetting.starcomment.LSStarCommentProtectSetting.INSTANCE
            boolean r0 = r0.getSettingValue()
            if (r0 != 0) goto L65
            java.lang.String r0 = "ls_setting_not_enable"
            r4.add(r0)
        L65:
            r1 = 1
            if (r5 == 0) goto L80
            com.bytedance.android.livesdk.message.proto.StarCommentConfig r0 = r5.starCommentConfig
            if (r0 == 0) goto L77
            boolean r0 = r0.starCommentQualification
            if (r0 != 0) goto L77
            java.lang.String r0 = "no_qualification"
            r4.add(r0)
            if (r5 == 0) goto L80
        L77:
            boolean r0 = r5.showStarCommentEntrance
            if (r0 != 0) goto L80
            java.lang.String r0 = "no_entrance"
            r4.add(r0)
        L80:
            if (r8 == 0) goto L8d
            int r0 = r8.intValue()
            if (r0 != r1) goto L8d
            java.lang.String r0 = "is_host"
            r4.add(r0)
        L8d:
            if (r5 == 0) goto Lb1
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.getStreamType()
        L93:
            if (r0 == r7) goto Laa
            if (r5 == 0) goto Laf
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.getStreamType()
        L9b:
            if (r0 == r3) goto Laa
            if (r5 == 0) goto La3
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r6 = r5.getStreamType()
        La3:
            if (r6 == r2) goto Laa
            java.lang.String r0 = "not_video_live"
            r4.add(r0)
        Laa:
            java.lang.String r0 = r4.toString()
            return r0
        Laf:
            r0 = r6
            goto L9b
        Lb1:
            r0 = r6
            goto L93
        Lb3:
            r0 = r6
            goto L54
        Lb5:
            r0 = r6
            goto L3d
        Lb7:
            r0 = r6
            goto L26
        Lba:
            r8 = r6
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.StarCommentService.E00(com.bytedance.ies.sdk.datachannel.DataChannel):java.lang.String");
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean ce0(Object obj) {
        StarCommentConfig starCommentConfig;
        if (!(obj instanceof Room) || (starCommentConfig = ((Room) obj).starCommentConfig) == null || !starCommentConfig.starCommentQualification) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final Pair<List<EmoteModel>, List<EmoteWithIndex>> dM2(String str) {
        if (a0.LJJJIL(str)) {
            return new Pair<>(new ArrayList(), new ArrayList());
        }
        try {
            List list = (List) C19748512Ol.LIZJ.LJIIIIZZ(str, new TypeToken<List<EmoteWithIndex>>() { // from class: X.0f9d
            }.getType());
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    EmoteModel emoteModel = ((EmoteWithIndex) it2.next()).emoteModel;
                    if (emoteModel != null) {
                        arrayList.add(emoteModel);
                    }
                }
            }
            return new Pair<>(arrayList, list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new Pair<>(new ArrayList(), new ArrayList());
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final C1116230f9Z L42(Fragment fragment, DataChannel dataChannel) {
        return new C1116230f9Z(fragment, dataChannel);
    }
}
