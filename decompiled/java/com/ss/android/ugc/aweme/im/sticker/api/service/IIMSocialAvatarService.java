package com.ss.android.ugc.aweme.im.sticker.api.service;

import X.AbstractC738140SxQ;
import X.C05YD;
import X.C0HK2;
import X.C0HZ0;
import X.C13BV;
import X.C13IQ;
import X.C18Y9;
import X.C1BNE;
import X.C2097608Jq;
import X.C442300HWa;
import X.C455420HtU;
import X.C459950I1x;
import X.C869590Y9l;
import X.EnumC454380Hro;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC442310HWb;
import X.InterfaceC453970Hr9;
import X.InterfaceC901690ZYx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.sticker.api.socialavatar.SocialAvatarSettingsConfig;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public interface IIMSocialAvatarService {

    public static final class Stub implements IIMSocialAvatarService {
        public static final Stub LIZ = new Stub();

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LIZIZ(@StickerVariant int i, long j) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LIZJ(int i) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJ(int i, String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final C13IQ<? extends AbstractC738140SxQ> LJFF() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final InterfaceC901690ZYx LJII(String str, String str2, StickerItem stickerItem, C459950I1x c459950I1x, Map map) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJIIIIZZ(String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJIIIZ(String str) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJIIL(String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJIILIIL(String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJIILL(SessionInfo sessionInfo, View view, long j, UrlModel urlModel, long j2, boolean z, String str, Long l, Long l2, String str2, int i, MixStudioComponent mixStudioComponent, AvatarDuoInfoComponent avatarDuoInfoComponent, String str3, FragmentManager fragmentManager) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJIILLIIL() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJIJI() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final StickerItem LJIJJ(SessionInfo sessionInfo, String str) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJIJJLI() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final Spannable LJIL(C869590Y9l c869590Y9l) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final String LJJ() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJI(String str) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIFFI(int i) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJII(StickerItem stickerItem, boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIIJ() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIIJZLJL() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIIZ(Function0<Unit> function0) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJIIZI() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final long LJJIJ() {
            return -1L;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIJIIJI(String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final Object LJJIJIIJIL(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIJIL(Context context, Long l, String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIJL(String str, String str2) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIJLIJ(long j) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJIL() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJIZ() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final Drawable LJJJI(Context context) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJJIL() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJJ(boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJJJI() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJJIZL() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJJJ(int i) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final String LJJJJJL() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJJL() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJJLL() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final int LJJJJZ() {
            return -1;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final String LJJJJZI() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJLIIL() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final String LJJJLL() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJLZIJ() {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJJZ(SessionInfo sessionInfo, View view, C455420HtU c455420HtU, FragmentManager fragmentManager) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJL(SessionInfo sessionInfo, View view, StickerTemplate stickerTemplate, String str, FragmentManager fragmentManager) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final int LJJLIIIIJ() {
            return -1;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJLIIIJ() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final void LJJLIIIJJI(long j, String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJLIIIJJIZ() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean LJJLIIIJL() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final boolean isEnabled() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final SocialAvatarSettingsConfig LJJJ() {
            return new SocialAvatarSettingsConfig(TimeUnit.HOURS.toMillis(1L), TimeUnit.SECONDS.toMillis(1L), TimeUnit.HOURS.toMillis(24L), "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/social-avatar-bighero.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/soclai-avatar-small-light.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/soclai-avatar-small-dark.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/social-avatar-story-3.png", "hi", "lol", "shocked", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/social-avatar-icon.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/sa_hero_image.png");
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final C0HZ0 LIZLLL() {
            return C0HZ0.NONE;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final InterfaceC453970Hr9 LJJLIIIJILLIZJL() {
            return new InterfaceC453970Hr9() { // from class: X.0HrA
                @Override // X.InterfaceC453970Hr9
                public final void LIZ(Function1<? super Boolean, Unit> function1) {
                }

                @Override // X.InterfaceC453970Hr9
                public final void LIZIZ(C455250HtD c455250HtD) {
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final List<String> LJJIII(String str) {
            return C13BV.INSTANCE;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final PreviewHintComponent LJJJJLI(AttachmentComponent attachmentComponent) {
            PreviewHintComponent.Companion.getClass();
            return C18Y9.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final Map LJI(StickerItem stickerItem, AttachmentComponent attachmentComponent) {
            return C2097608Jq.LJ();
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final List<StickerItem> LJIIJ(List<StickerItem> list, EnumC454380Hro enumC454380Hro) {
            return C13BV.INSTANCE;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        @InterfaceC1294060jmO
        public final Map LJIIJJI(SetSticker setSticker, AttachmentComponent attachmentComponent) {
            return C2097608Jq.LJ();
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final InterfaceC442310HWb LJIILJJIL(EnumC454380Hro enumC454380Hro, String str) {
            return C442300HWa.LIZ;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final List<StickerItem> LJIIZILJ(String str, String str2) {
            return C13BV.INSTANCE;
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final LiveData<InterfaceC442310HWb> LJIJ(EnumC454380Hro enumC454380Hro, String str) {
            return new LiveData<InterfaceC442310HWb>() { // from class: com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService$Stub$getLiveDataStatus$1
            };
        }

        @Override // com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService
        public final C05YD<IMSocialAvatarStatus> LJJLI(String str, boolean z) {
            return C1BNE.LIZ(C0HK2.INSTANCE);
        }
    }

    void LIZIZ(@StickerVariant int i, long j);

    void LIZJ(int i);

    C0HZ0 LIZLLL();

    void LJ(int i, String str);

    C13IQ<? extends AbstractC738140SxQ> LJFF();

    Map LJI(StickerItem stickerItem, AttachmentComponent attachmentComponent);

    InterfaceC901690ZYx LJII(String str, String str2, StickerItem stickerItem, C459950I1x c459950I1x, Map map);

    void LJIIIIZZ(String str);

    boolean LJIIIZ(String str);

    List<StickerItem> LJIIJ(List<StickerItem> list, EnumC454380Hro enumC454380Hro);

    @InterfaceC1294060jmO
    Map LJIIJJI(SetSticker setSticker, AttachmentComponent attachmentComponent);

    void LJIIL(String str);

    void LJIILIIL(String str);

    InterfaceC442310HWb LJIILJJIL(EnumC454380Hro enumC454380Hro, String str);

    void LJIILL(SessionInfo sessionInfo, View view, long j, UrlModel urlModel, long j2, boolean z, String str, Long l, Long l2, String str2, int i, MixStudioComponent mixStudioComponent, AvatarDuoInfoComponent avatarDuoInfoComponent, String str3, FragmentManager fragmentManager);

    boolean LJIILLIIL();

    List<StickerItem> LJIIZILJ(String str, String str2);

    LiveData<InterfaceC442310HWb> LJIJ(EnumC454380Hro enumC454380Hro, String str);

    void LJIJI();

    StickerItem LJIJJ(SessionInfo sessionInfo, String str);

    boolean LJIJJLI();

    Spannable LJIL(C869590Y9l c869590Y9l);

    String LJJ();

    boolean LJJI(String str);

    void LJJIFFI(int i);

    void LJJII(StickerItem stickerItem, boolean z);

    List<String> LJJIII(String str);

    void LJJIIJ();

    void LJJIIJZLJL();

    void LJJIIZ(Function0<Unit> function0);

    boolean LJJIIZI();

    long LJJIJ();

    void LJJIJIIJI(String str);

    Object LJJIJIIJIL(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJJIJIL(Context context, Long l, String str);

    void LJJIJL(String str, String str2);

    void LJJIJLIJ(long j);

    void LJJIL();

    boolean LJJIZ();

    SocialAvatarSettingsConfig LJJJ();

    Drawable LJJJI(Context context);

    boolean LJJJIL();

    void LJJJJ(boolean z);

    boolean LJJJJI();

    void LJJJJIZL();

    void LJJJJJ(int i);

    String LJJJJJL();

    void LJJJJL();

    PreviewHintComponent LJJJJLI(AttachmentComponent attachmentComponent);

    void LJJJJLL();

    int LJJJJZ();

    String LJJJJZI();

    void LJJJLIIL();

    String LJJJLL();

    void LJJJLZIJ();

    void LJJJZ(SessionInfo sessionInfo, View view, C455420HtU c455420HtU, FragmentManager fragmentManager);

    void LJJL(SessionInfo sessionInfo, View view, StickerTemplate stickerTemplate, String str, FragmentManager fragmentManager);

    C05YD<IMSocialAvatarStatus> LJJLI(String str, boolean z);

    int LJJLIIIIJ();

    boolean LJJLIIIJ();

    InterfaceC453970Hr9 LJJLIIIJILLIZJL();

    void LJJLIIIJJI(long j, String str);

    boolean LJJLIIIJJIZ();

    boolean LJJLIIIJL();

    boolean isEnabled();
}
