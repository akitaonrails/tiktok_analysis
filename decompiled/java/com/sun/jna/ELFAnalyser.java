package com.sun.jna;

import X.C08FF;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ELFAnalyser {
    public static final byte[] ELF_MAGIC = {127, 69, 76, 70};
    public boolean ELF;
    public boolean _64Bit;
    public boolean arm;
    public boolean armEabiAapcsVfp;
    public boolean armHardFloatFlag;
    public boolean armSoftFloatFlag;
    public boolean bigEndian;
    public final String filename;

    public static class ArmAeabiAttributesTag {
        public static final ArmAeabiAttributesTag ABI_FP_16bit_format;
        public static final ArmAeabiAttributesTag ABI_FP_denormal;
        public static final ArmAeabiAttributesTag ABI_FP_exceptions;
        public static final ArmAeabiAttributesTag ABI_FP_number_model;
        public static final ArmAeabiAttributesTag ABI_FP_optimization_goals;
        public static final ArmAeabiAttributesTag ABI_FP_rounding;
        public static final ArmAeabiAttributesTag ABI_FP_user_exceptions;
        public static final ArmAeabiAttributesTag ABI_HardFP_use;
        public static final ArmAeabiAttributesTag ABI_PCS_GOT_use;
        public static final ArmAeabiAttributesTag ABI_PCS_R9_use;
        public static final ArmAeabiAttributesTag ABI_PCS_RO_data;
        public static final ArmAeabiAttributesTag ABI_PCS_RW_data;
        public static final ArmAeabiAttributesTag ABI_PCS_wchar_t;
        public static final ArmAeabiAttributesTag ABI_VFP_args;
        public static final ArmAeabiAttributesTag ABI_WMMX_args;
        public static final ArmAeabiAttributesTag ABI_align8_preserved;
        public static final ArmAeabiAttributesTag ABI_align_needed;
        public static final ArmAeabiAttributesTag ABI_enum_size;
        public static final ArmAeabiAttributesTag ABI_optimization_goals;
        public static final ArmAeabiAttributesTag ARM_ISA_use;
        public static final ArmAeabiAttributesTag Advanced_SIMD_arch;
        public static final ArmAeabiAttributesTag CPU_arch;
        public static final ArmAeabiAttributesTag CPU_arch_profile;
        public static final ArmAeabiAttributesTag CPU_name;
        public static final ArmAeabiAttributesTag CPU_raw_name;
        public static final ArmAeabiAttributesTag CPU_unaligned_access;
        public static final ArmAeabiAttributesTag DIV_use;
        public static final ArmAeabiAttributesTag FP_HP_extension;
        public static final ArmAeabiAttributesTag FP_arch;
        public static final ArmAeabiAttributesTag File;
        public static final ArmAeabiAttributesTag MPextension_use;
        public static final ArmAeabiAttributesTag MPextension_use2;
        public static final ArmAeabiAttributesTag PCS_config;
        public static final ArmAeabiAttributesTag Section;
        public static final ArmAeabiAttributesTag Symbol;
        public static final ArmAeabiAttributesTag T2EE_use;
        public static final ArmAeabiAttributesTag THUMB_ISA_use;
        public static final ArmAeabiAttributesTag Virtualization_use;
        public static final ArmAeabiAttributesTag WMMX_arch;
        public static final ArmAeabiAttributesTag also_compatible_with;
        public static final ArmAeabiAttributesTag compatibility;
        public static final ArmAeabiAttributesTag conformance;
        public static final ArmAeabiAttributesTag nodefaults;
        public final String name;
        public final ParameterType parameterType;
        public final int value;
        public static final List<ArmAeabiAttributesTag> tags = new LinkedList();
        public static final Map<Integer, ArmAeabiAttributesTag> valueMap = new HashMap();
        public static final Map<String, ArmAeabiAttributesTag> nameMap = new HashMap();

        static {
            ParameterType parameterType = ParameterType.UINT32;
            File = addTag(1, "File", parameterType);
            Section = addTag(2, "Section", parameterType);
            Symbol = addTag(3, "Symbol", parameterType);
            ParameterType parameterType2 = ParameterType.NTBS;
            CPU_raw_name = addTag(4, "CPU_raw_name", parameterType2);
            CPU_name = addTag(5, "CPU_name", parameterType2);
            ParameterType parameterType3 = ParameterType.ULEB128;
            CPU_arch = addTag(6, "CPU_arch", parameterType3);
            CPU_arch_profile = addTag(7, "CPU_arch_profile", parameterType3);
            ARM_ISA_use = addTag(8, "ARM_ISA_use", parameterType3);
            THUMB_ISA_use = addTag(9, "THUMB_ISA_use", parameterType3);
            FP_arch = addTag(10, "FP_arch", parameterType3);
            WMMX_arch = addTag(11, "WMMX_arch", parameterType3);
            Advanced_SIMD_arch = addTag(12, "Advanced_SIMD_arch", parameterType3);
            PCS_config = addTag(13, "PCS_config", parameterType3);
            ABI_PCS_R9_use = addTag(14, "ABI_PCS_R9_use", parameterType3);
            ABI_PCS_RW_data = addTag(15, "ABI_PCS_RW_data", parameterType3);
            ABI_PCS_RO_data = addTag(16, "ABI_PCS_RO_data", parameterType3);
            ABI_PCS_GOT_use = addTag(17, "ABI_PCS_GOT_use", parameterType3);
            ABI_PCS_wchar_t = addTag(18, "ABI_PCS_wchar_t", parameterType3);
            ABI_FP_rounding = addTag(19, "ABI_FP_rounding", parameterType3);
            ABI_FP_denormal = addTag(20, "ABI_FP_denormal", parameterType3);
            ABI_FP_exceptions = addTag(21, "ABI_FP_exceptions", parameterType3);
            ABI_FP_user_exceptions = addTag(22, "ABI_FP_user_exceptions", parameterType3);
            ABI_FP_number_model = addTag(23, "ABI_FP_number_model", parameterType3);
            ABI_align_needed = addTag(24, "ABI_align_needed", parameterType3);
            ABI_align8_preserved = addTag(25, "ABI_align8_preserved", parameterType3);
            ABI_enum_size = addTag(26, "ABI_enum_size", parameterType3);
            ABI_HardFP_use = addTag(27, "ABI_HardFP_use", parameterType3);
            ABI_VFP_args = addTag(28, "ABI_VFP_args", parameterType3);
            ABI_WMMX_args = addTag(29, "ABI_WMMX_args", parameterType3);
            ABI_optimization_goals = addTag(30, "ABI_optimization_goals", parameterType3);
            ABI_FP_optimization_goals = addTag(31, "ABI_FP_optimization_goals", parameterType3);
            compatibility = addTag(32, "compatibility", parameterType2);
            CPU_unaligned_access = addTag(34, "CPU_unaligned_access", parameterType3);
            FP_HP_extension = addTag(36, "FP_HP_extension", parameterType3);
            ABI_FP_16bit_format = addTag(38, "ABI_FP_16bit_format", parameterType3);
            MPextension_use = addTag(42, "MPextension_use", parameterType3);
            DIV_use = addTag(44, "DIV_use", parameterType3);
            nodefaults = addTag(64, "nodefaults", parameterType3);
            also_compatible_with = addTag(65, "also_compatible_with", parameterType2);
            conformance = addTag(67, "conformance", parameterType2);
            T2EE_use = addTag(66, "T2EE_use", parameterType3);
            Virtualization_use = addTag(68, "Virtualization_use", parameterType3);
            MPextension_use2 = addTag(70, "MPextension_use", parameterType3);
        }

        public static List<ArmAeabiAttributesTag> getTags() {
            return Collections.unmodifiableList(tags);
        }

        public int hashCode() {
            return 469 + this.value;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.name);
            sbLIZ.append(" (");
            sbLIZ.append(this.value);
            sbLIZ.append(")");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public String getName() {
            return this.name;
        }

        public ParameterType getParameterType() {
            return this.parameterType;
        }

        public int getValue() {
            return this.value;
        }

        public enum ParameterType {
            UINT32,
            NTBS,
            ULEB128;

            public static ParameterType valueOf(String str) {
                return (ParameterType) C08FF.LIZ(ParameterType.class, str);
            }
        }

        public static ArmAeabiAttributesTag getByName(String str) {
            return nameMap.get(str);
        }

        public static ArmAeabiAttributesTag getByValue(int i) {
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            if (map.containsKey(Integer.valueOf(i))) {
                return map.get(Integer.valueOf(i));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown ");
            sbLIZ.append(i);
            return new ArmAeabiAttributesTag(i, C2188811AlT.LIZIZ(sbLIZ), getParameterType(i));
        }

        public static ParameterType getParameterType(int i) {
            ArmAeabiAttributesTag byValue = getByValue(i);
            if (byValue == null) {
                if (i % 2 == 0) {
                    return ParameterType.ULEB128;
                }
                return ParameterType.NTBS;
            }
            return byValue.getParameterType();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.value == ((ArmAeabiAttributesTag) obj).value) {
                return true;
            }
            return false;
        }

        public ArmAeabiAttributesTag(int i, String str, ParameterType parameterType) {
            this.value = i;
            this.name = str;
            this.parameterType = parameterType;
        }

        public static ArmAeabiAttributesTag addTag(int i, String str, ParameterType parameterType) {
            ArmAeabiAttributesTag armAeabiAttributesTag = new ArmAeabiAttributesTag(i, str, parameterType);
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            if (!map.containsKey(Integer.valueOf(armAeabiAttributesTag.getValue()))) {
                map.put(Integer.valueOf(armAeabiAttributesTag.getValue()), armAeabiAttributesTag);
            }
            Map<String, ArmAeabiAttributesTag> map2 = nameMap;
            if (!map2.containsKey(armAeabiAttributesTag.getName())) {
                map2.put(armAeabiAttributesTag.getName(), armAeabiAttributesTag);
            }
            tags.add(armAeabiAttributesTag);
            return armAeabiAttributesTag;
        }
    }

    /* JADX INFO: renamed from: com.sun.jna.ELFAnalyser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType;

        static {
            int[] iArr = new int[ArmAeabiAttributesTag.ParameterType.values().length];
            $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType = iArr;
            try {
                iArr[ArmAeabiAttributesTag.ParameterType.UINT32.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType[ArmAeabiAttributesTag.ParameterType.NTBS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType[ArmAeabiAttributesTag.ParameterType.ULEB128.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public static class ELFSectionHeaderEntry {
        public final int flags;
        public String name;
        public final int nameOffset;
        public final int offset;
        public final int size;
        public final int type;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ELFSectionHeaderEntry{nameIdx=");
            sbLIZ.append(this.nameOffset);
            sbLIZ.append(", name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", flags=");
            sbLIZ.append(this.flags);
            sbLIZ.append(", offset=");
            sbLIZ.append(this.offset);
            sbLIZ.append(", size=");
            sbLIZ.append(this.size);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public int getFlags() {
            return this.flags;
        }

        public String getName() {
            return this.name;
        }

        public int getNameOffset() {
            return this.nameOffset;
        }

        public int getOffset() {
            return this.offset;
        }

        public int getSize() {
            return this.size;
        }

        public int getType() {
            return this.type;
        }

        public void setName(String str) {
            this.name = str;
        }

        public ELFSectionHeaderEntry(boolean z, ByteBuffer byteBuffer) {
            long j;
            long j2;
            long j3;
            this.nameOffset = byteBuffer.getInt(0);
            this.type = byteBuffer.getInt(4);
            if (z) {
                j = byteBuffer.getLong(8);
            } else {
                j = byteBuffer.getInt(8);
            }
            this.flags = (int) j;
            if (z) {
                j2 = byteBuffer.getLong(24);
            } else {
                j2 = byteBuffer.getInt(16);
            }
            this.offset = (int) j2;
            if (z) {
                j3 = byteBuffer.getLong(32);
            } else {
                j3 = byteBuffer.getInt(20);
            }
            this.size = (int) j3;
        }
    }

    private void runDetection() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.filename, "r");
        try {
            if (randomAccessFile.length() > 4) {
                byte[] bArr = new byte[4];
                randomAccessFile.seek(0L);
                randomAccessFile.read(bArr);
                if (Arrays.equals(bArr, ELF_MAGIC)) {
                    this.ELF = true;
                }
            }
            if (!this.ELF) {
                try {
                    randomAccessFile.close();
                    return;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            randomAccessFile.seek(4L);
            byte b = randomAccessFile.readByte();
            byte b2 = randomAccessFile.readByte();
            this._64Bit = b == 2;
            this.bigEndian = b2 == 2;
            randomAccessFile.seek(0L);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this._64Bit ? 64 : 52);
            randomAccessFile.getChannel().read(byteBufferAllocate, 0L);
            byteBufferAllocate.order(this.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            boolean z = byteBufferAllocate.get(18) == 40;
            this.arm = z;
            if (z) {
                int i = byteBufferAllocate.getInt(this._64Bit ? 48 : 36);
                this.armHardFloatFlag = (i & 1024) == 1024;
                this.armSoftFloatFlag = (i & 512) == 512;
                parseEabiAapcsVfp(byteBufferAllocate, randomAccessFile);
            }
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw th;
            }
        }
    }

    public boolean isArmHardFloat() {
        return isArmEabiAapcsVfp() || isArmHardFloatFlag();
    }

    public static class ELFSectionHeaders {
        public final List<ELFSectionHeaderEntry> entries = new ArrayList();

        public List<ELFSectionHeaderEntry> getEntries() {
            return this.entries;
        }

        public ELFSectionHeaders(boolean z, boolean z2, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
            long j;
            short s;
            short s2;
            short s3;
            ByteOrder byteOrder;
            ByteOrder byteOrder2;
            byte b;
            if (z) {
                j = byteBuffer.getLong(40);
                s = byteBuffer.getShort(58);
                s2 = byteBuffer.getShort(60);
                s3 = byteBuffer.getShort(62);
            } else {
                j = byteBuffer.getInt(32);
                s = byteBuffer.getShort(46);
                s2 = byteBuffer.getShort(48);
                s3 = byteBuffer.getShort(50);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s2 * s);
            if (z2) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.getChannel().read(byteBufferAllocate, j);
            for (int i = 0; i < s2; i++) {
                byteBufferAllocate.position(i * s);
                ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                byteBufferSlice.order(byteBufferAllocate.order());
                byteBufferSlice.limit(s);
                this.entries.add(new ELFSectionHeaderEntry(z, byteBufferSlice));
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(((ELFSectionHeaderEntry) ListProtector.get(this.entries, s3)).getSize());
            if (z2) {
                byteOrder2 = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            }
            byteBufferAllocate2.order(byteOrder2);
            randomAccessFile.getChannel().read(byteBufferAllocate2, r1.getOffset());
            byteBufferAllocate2.rewind();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
            for (ELFSectionHeaderEntry eLFSectionHeaderEntry : this.entries) {
                byteArrayOutputStream.reset();
                byteBufferAllocate2.position(eLFSectionHeaderEntry.getNameOffset());
                while (byteBufferAllocate2.position() < byteBufferAllocate2.limit() && (b = byteBufferAllocate2.get()) != 0) {
                    byteArrayOutputStream.write(b);
                }
                eLFSectionHeaderEntry.setName(byteArrayOutputStream.toString("ASCII"));
            }
        }
    }

    public String getFilename() {
        return this.filename;
    }

    public boolean is64Bit() {
        return this._64Bit;
    }

    public boolean isArm() {
        return this.arm;
    }

    public boolean isArmEabiAapcsVfp() {
        return this.armEabiAapcsVfp;
    }

    public boolean isArmHardFloatFlag() {
        return this.armHardFloatFlag;
    }

    public boolean isArmSoftFloatFlag() {
        return this.armSoftFloatFlag;
    }

    public boolean isBigEndian() {
        return this.bigEndian;
    }

    public boolean isELF() {
        return this.ELF;
    }

    public ELFAnalyser(String str) {
        this.filename = str;
    }

    public static ELFAnalyser analyse(String str) {
        ELFAnalyser eLFAnalyser = new ELFAnalyser(str);
        eLFAnalyser.runDetection();
        return eLFAnalyser;
    }

    public static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseAEABI(ByteBuffer byteBuffer) {
        HashMap map = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            int iPosition = byteBuffer.position();
            int iIntValue = readULEB128(byteBuffer).intValue();
            int i = byteBuffer.getInt();
            if (iIntValue == 1) {
                map.put(Integer.valueOf(iIntValue), parseFileAttribute(byteBuffer));
            }
            byteBuffer.position(iPosition + i);
        }
        return map;
    }

    public static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseArmAttributes(ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 65) {
            return Collections.EMPTY_MAP;
        }
        while (byteBuffer.position() < byteBuffer.limit()) {
            int iPosition = byteBuffer.position();
            int i = byteBuffer.getInt();
            if (i <= 0) {
                break;
            }
            if ("aeabi".equals(readNTBS(byteBuffer, null))) {
                return parseAEABI(byteBuffer);
            }
            byteBuffer.position(iPosition + i);
        }
        return Collections.EMPTY_MAP;
    }

    public static Map<ArmAeabiAttributesTag, Object> parseFileAttribute(ByteBuffer byteBuffer) {
        HashMap map = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            ArmAeabiAttributesTag byValue = ArmAeabiAttributesTag.getByValue(readULEB128(byteBuffer).intValue());
            int i = AnonymousClass1.$SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType[byValue.getParameterType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        map.put(byValue, readULEB128(byteBuffer));
                    }
                } else {
                    map.put(byValue, readNTBS(byteBuffer, null));
                }
            } else {
                map.put(byValue, Integer.valueOf(byteBuffer.getInt()));
            }
        }
        return map;
    }

    public static BigInteger readULEB128(ByteBuffer byteBuffer) {
        BigInteger bigIntegerOr = BigInteger.ZERO;
        int i = 0;
        while (true) {
            byte b = byteBuffer.get();
            bigIntegerOr = bigIntegerOr.or(BigInteger.valueOf(b & 127).shiftLeft(i));
            if ((b & 128) == 0) {
                return bigIntegerOr;
            }
            i += 7;
        }
    }

    private void parseEabiAapcsVfp(ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
        ByteOrder byteOrder;
        for (ELFSectionHeaderEntry eLFSectionHeaderEntry : new ELFSectionHeaders(this._64Bit, this.bigEndian, byteBuffer, randomAccessFile).getEntries()) {
            if (".ARM.attributes".equals(eLFSectionHeaderEntry.getName())) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(eLFSectionHeaderEntry.getSize());
                if (this.bigEndian) {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBufferAllocate.order(byteOrder);
                randomAccessFile.getChannel().read(byteBufferAllocate, eLFSectionHeaderEntry.getOffset());
                byteBufferAllocate.rewind();
                Map<ArmAeabiAttributesTag, Object> map = parseArmAttributes(byteBufferAllocate).get(1);
                if (map != null) {
                    Object obj = map.get(ArmAeabiAttributesTag.ABI_VFP_args);
                    if ((obj instanceof Integer) && ((Integer) obj).equals(1)) {
                        this.armEabiAapcsVfp = true;
                    } else if ((obj instanceof BigInteger) && ((BigInteger) obj).intValue() == 1) {
                        this.armEabiAapcsVfp = true;
                    }
                }
            }
        }
    }

    public static String readNTBS(ByteBuffer byteBuffer, Integer num) {
        if (num != null) {
            byteBuffer.position(num.intValue());
        }
        int iPosition = byteBuffer.position();
        while (byteBuffer.get() != 0 && byteBuffer.position() <= byteBuffer.limit()) {
        }
        byte[] bArr = new byte[(byteBuffer.position() - iPosition) - 1];
        byteBuffer.position(iPosition);
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() + 1);
        try {
            return new String(bArr, "ASCII");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
