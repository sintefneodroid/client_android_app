// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class FValue extends Table {
  public static FValue getRootAsFValue(ByteBuffer _bb) {
    return getRootAsFValue(_bb, new FValue());
  }

  public static FValue getRootAsFValue(ByteBuffer _bb, FValue obj) {
    _bb.order(ByteOrder.LITTLE_ENDIAN);
    return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
  }

  public FValue __assign(int _i, ByteBuffer _bb) {
    __init(_i, _bb);
    return this;
  }

  public void __init(int _i, ByteBuffer _bb) {
    bb_pos = _i;
    bb = _bb;
  }

  public static int createFValue(FlatBufferBuilder builder, double val) {
    builder.startObject(1);
    FValue.addVal(builder, val);
    return FValue.endFValue(builder);
  }

  public static void addVal(FlatBufferBuilder builder, double val) {
    builder.addDouble(0, val, 0.0);
  }

  public static int endFValue(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }

  public static void startFValue(FlatBufferBuilder builder) {
    builder.startObject(1);
  }

  public double val() {
    int o = __offset(4);
    return o != 0 ? bb.getDouble(o + bb_pos) : 0.0;
  }
}
